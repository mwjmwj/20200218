package com.cp.util.tools;

import com.cp.util.exception.SearchException;
import com.cp.util.result.PageInfo;
import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CommonUtils {
    private static final Logger logger = LoggerFactory.getLogger(CommonUtils.class);
    public static final String dateFormate = "yyyy-MM-dd HH:mm:ss";
    private static final String dateFormateReg = "^((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29))\\s+([0-1]?[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";
    private static final String timeFormateReg = "([0-1]?[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])";
    private static final String lotteryTime = "21:30:00";
    public static <T> T copyObject(Object entity,Class<T> clazz){
        if(clazz==null){
            throw new SearchException("拷贝对象字节码不能为空");
        }
        if(entity==null){
            logger.warn("被拷贝对象不能为空,返回一个空对象");
            try {
                return clazz.newInstance();
            } catch (Exception e) {
                throw new SearchException("被拷贝对象不能为空时，通过字节对象的newInstance()方法创建对象失败");
            }
        }

        try {
            DozerBeanMapper mapper = new DozerBeanMapper();
            return mapper.map(entity, clazz);
        } catch (Exception e) {
            throw new SearchException(e);
        }
    }
    public static <T> List<T> copyObjects(Object entitys, Class<T> clazz){
        if(entitys==null){
            logger.warn("被拷贝对象不能为空,返回一个空对象");
            return new ArrayList<>();
        }
        if(!(entitys instanceof Collection)){
            throw new SearchException("该方法只支持集合");
        }
        List tmp = (List) entitys;
        List<T> ts = new ArrayList<>();
        for(Object entity:tmp){
            T r = copyObject(entity,clazz);
            ts.add(r);
        }
       return ts;
    }

    public static PageInfo toPageObject(com.github.pagehelper.PageInfo pageInfo){
        PageInfo result = new PageInfo();
        result.setEndRow(pageInfo.getEndRow());
        result.setNavigatepageNums(pageInfo.getNavigatepageNums());
        result.setNavigatePages(pageInfo.getNavigatePages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPages(pageInfo.getPages());
        result.setPageSize(pageInfo.getPageSize());
        result.setPrePage(pageInfo.getPrePage());
        result.setNextPage(pageInfo.getNextPage());
        result.setSize(pageInfo.getSize());
        result.setStartRow(pageInfo.getStartRow());
        result.setTotal(pageInfo.getTotal());
        result.setNavigateFirstPage(pageInfo.getNavigateFirstPage());
        result.setNavigateLastPage(pageInfo.getNavigateLastPage());
        return result;
    }
    public static String uuid(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


    public static String updateLotteryTime(String lotteryDateTime) {
        if(dateFieldCHeck(lotteryDateTime)){
            throw new SearchException("格式不正确");
        }
        return lotteryDateTime.replaceAll(timeFormateReg,lotteryTime);
    }
    public static String dateField() {
        return new SimpleDateFormat(dateFormate).format(new Date(System.currentTimeMillis()));
    }
    public static String dateField(Long timestamp) {
        return new SimpleDateFormat(dateFormate).format(new Date(timestamp));
    }
    public static long getTimeStamp(String datetime) {
        try {
            return new SimpleDateFormat(dateFormate).parse(datetime).getTime();
        } catch (ParseException e) {
            return -1;
        }
    }
    public static boolean dateFieldCHeck(String datetimeStr) {
        boolean result = Pattern.matches(dateFormateReg, datetimeStr);
        return !result;
    }

    /**
     * 比较时间datetimeStr1>datetimeStr2返回true，否则false
     * @param datetimeStr1
     * @param datetimeStr2
     * @return
     */
    public static boolean dateFieldCompare(String datetimeStr1,String datetimeStr2) {
        try {
            Long d1 = new SimpleDateFormat(dateFormate).parse(datetimeStr1).getTime();
            Long d2 = new SimpleDateFormat(dateFormate).parse(datetimeStr2).getTime();
            return d1>d2;
        } catch (ParseException e) {
            e.printStackTrace();
            return true;
        }
    }
    public static String lotteryPeriodFormate(String lotteryPeriod){
        if(StringUtils.isEmpty(lotteryPeriod)){
            throw new SearchException("开奖记录期数:不能为空");
        }
        if(!Pattern.matches("^[0-9]\\d{0,2}$",lotteryPeriod)){
            throw new SearchException("开奖记录期数:只能以非0数字,位数最多三位");
        }
        if(lotteryPeriod.length()==1){
            lotteryPeriod = "00"+lotteryPeriod;
        }else if(lotteryPeriod.length()==2){
            lotteryPeriod = "0"+lotteryPeriod;
        }
        return lotteryPeriod;
    }




    public static String getWeek(String dateStr) {
        String week = "";
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(new SimpleDateFormat(CommonUtils.dateFormate).parse(dateStr));
        } catch (ParseException e) {
        }
        int weekday = c.get(Calendar.DAY_OF_WEEK);
        if (weekday == 1) {
            week = "周日";
        } else if (weekday == 2) {
            week = "周一";
        } else if (weekday == 3) {
            week = "周二";
        } else if (weekday == 4) {
            week = "周三";
        } else if (weekday == 5) {
            week = "周四";
        } else if (weekday == 6) {
            week = "周五";
        } else if (weekday == 7) {
            week = "周六";
        }
        return week;
    }


    public static List<String> everyDayForLotterDate(String dateBegin,String dateEnd){
        List<String> tmp = everyDay(dateBegin,dateEnd);
        return tmp.stream().filter(e->{
            String week = getWeek(e);
            if("周一".equals(week)||"周三".equals(week)||"周五".equals(week)){
                return true;
            }
            return false;
        }).collect(Collectors.toList());
    }

    public static List<String> everyDay(String dateBegin,String dateEnd){
        List<String> result = new ArrayList<>();
        Calendar dayc1 = new GregorianCalendar();
        Calendar dayc2 = new GregorianCalendar();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dayc1.setTime(df.parse(dateBegin)); //设置calendar的日期
            dayc2.setTime(df.parse(dateEnd));

            for (; dayc1.compareTo(dayc2) <= 0; ) {   //dayc1在dayc2之前就循环
                result.add(dayc1.get(Calendar.YEAR) + "-" + (dayc1.get(Calendar.MONTH)+1) + "-" + dayc1.get(Calendar.DATE)+" "+lotteryTime);
                dayc1.add(Calendar.DAY_OF_YEAR, 1);  //加1天
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static int[] randNum(){
        int result[] = new int[7];
        Random random = new Random();
        int z=0;
        while(result.length<=7){
            while(true){
                int tmp = random.nextInt(49)+1;
                boolean flag = false;
                for(int i=0;i<result.length;i++){
                    if(result[i]==tmp){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    result[z] = tmp;
                    break;
                }
                continue;
            }
            z++;
        }
        return result;
    }
}
