package com.cp.task;

import com.cp.bean.BaseAnimal;
import com.cp.bean.Lottery;
import com.cp.bean.LotteryDetail;
import com.cp.bean.NumColor;
import com.cp.dao.BaseAnimalMapper;
import com.cp.dao.NumColorMapper;
import com.cp.service.*;
import com.cp.util.DateUtil;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;

/**
 *  自动生成开奖号码
 */
@Component
public class LotteryTask {

    public static void main(String[] args) {

        int[] a = new int[49];

        for (int i = 0; i < 49 ; i++) {
            a[i] = i+1 ;
        }
        System.out.println(Arrays.toString(a));

    }



    @Autowired
    private YearNumService yearService;

    @Autowired
    private BiyLotteryService biyLotteryService;

    @Autowired
    private LotteryService lotteryService;

    @Autowired
    private LotteryDetailService lotteryDetailService;

    @Autowired
    private NumColorMapper numColorMapper;

    @Autowired
    private BaseAnimalMapper baseAnimalMapper;


    public static SecureRandom sr = new SecureRandom();

    @Scheduled(cron="0/10 * * * * ?")
    public void initPeriod(){

        sr.nextInt(49);

        String year = DateUtil.getDays();

        // 获取未完成开奖的期
        List<Lottery> needList = lotteryService.listNotLottery();


        if(CollectionUtils.isEmpty(needList)){
            return;
        }



        for (Lottery lottery : needList) {
            // 开始开奖 每个摇一个号码
            generatorBord(lottery);
        }


    }

    /**
     *  每一期摇一个号码 如果是期的结束已经结束了则摇完
     * @param lottery
     */
    private void generatorBord(Lottery lottery) {

        if(new Date().before(lottery.getBeginTm())){
            return;
        }


        List<LotteryDetail> lists = lotteryDetailService.listDetail(lottery.getId());

        if(CollectionUtils.isEmpty(lists)){

         // 如果结束日期已经超过了现在时间则全部一次性生成
         if(null!=lottery.getEndTm() && new Date().after(lottery.getEndTm())){

             LotteryDetail lotteryDetail;
             List<LotteryDetail> inserts = Lists.newArrayList();

             Set<Integer> set = new HashSet();
             int bord = 0;
             int sum = 0;
             for (int i = 0; i < 7 ; i++) {
                 bord = randomNum(set);
                 set.add(bord);
                 sum+=bord;
                 inserts.add(converLottertDetail(bord,lottery,i+1));
             }

             BaseAnimal animal = buildAnimal(lottery.getPeriod(),bord);

             lottery.setJiaye(animal.getJiaye());
             lottery.setSex(animal.getSex());

             NumColor numColor = getColor(bord);
             lottery.setsColor(numColor.getColor());
             lottery.setWuxing(numColor.getWuxing());
             lottery.setsDanShuang(1==bord%2?"单":"双");
             lottery.setsHead(bord/10+"");
             lottery.setsTail(bord%10+"");
             lottery.setsHe((bord/10+bord%10)+"");
             lottery.setEndFlag(1+"");
             lottery.setAllSum(sum+"");

             lotteryService.insertSelective(lottery);

             for (LotteryDetail insert : inserts) {
                 lotteryDetailService.insertSelective(insert);
             }

             return;
         }
            int bord = randomNum(new HashSet());
            lotteryDetailService.insertSelective(converLottertDetail(bord,lottery,1));
            return;
        }

        // 还没开到最后一个号码
        Set s = new HashSet();
        int sum = 0;
        int maxOrder = 0;
        for (LotteryDetail l : lists) {

            if(maxOrder<Integer.parseInt(l.getOrder())){
                maxOrder = Integer.parseInt(l.getOrder());
            }

            s.add(Integer.parseInt(l.getNum()));

            sum+= Integer.parseInt(l.getNum());
        }
        int bord = randomNum(s);
        lotteryDetailService.insertSelective(converLottertDetail(bord,lottery,maxOrder));

        if(lists.size()<6){
            return;
        }


        BaseAnimal animal = buildAnimal(lottery.getPeriod(),bord);

        lottery.setJiaye(animal.getJiaye());
        lottery.setSex(animal.getSex());
        NumColor numColor = getColor(bord);
        lottery.setsColor(numColor.getColor());
        lottery.setWuxing(numColor.getWuxing());
        lottery.setsDanShuang(1==bord%2?"单":"双");
        lottery.setsHead(bord/10+"");
        lottery.setsTail(bord%10+"");
        lottery.setsHe((bord/10+bord%10)+"");

        lists.forEach(l->s.add(Integer.parseInt(l.getOrder())));

        lottery.setAllSum((sum+bord)+"");

        lottery.setEndFlag(1+"");
        lotteryService.insertSelective(lottery);

    }

    private Map<String,BaseAnimal> animals;

    private BaseAnimal buildAnimal(String period, int bord) {
        String year = period.substring(0,4);
        // 2020 为元年鼠
        int startYear = 2020;
        int index = (Integer.parseInt(year)+1200-startYear+bord)%12;

        if(CollectionUtils.isEmpty(animals)){
            animals = baseAnimalMapper.listAll().stream().collect(Collectors.toMap(BaseAnimal::getOrder, o->o,(o, n)->o));
        }
        return animals.get(index+"");
    }

    private LotteryDetail converLottertDetail(int bord, Lottery lottery, int i) {
        LotteryDetail detail = new LotteryDetail();
        detail.setTlId(lottery.getId());
        detail.setNum(bord+"");
        detail.setOrder(i+"");
        detail.setCreateTm(new Date());
        detail.setCodeType(i==7?"1":"0");
        detail.setColor(getColor(bord).getColor());
        return detail;
    }


    public  Map<String,NumColor> numColorsMap;

    private NumColor getColor(int bord) {
        if(CollectionUtils.isEmpty(numColorsMap)){
            numColorsMap = numColorMapper.listAll().stream().collect(Collectors.toMap(NumColor::getNum, o->o,(o, n)->o));
        }
        return numColorsMap.get(bord+"");
    }

    public int  randomNum(Set<Integer> s){

        int i = sr.nextInt(49)+1;
        while(s.contains(i)){
            i = sr.nextInt(49)+1;
        }
        return i;
    }


}
