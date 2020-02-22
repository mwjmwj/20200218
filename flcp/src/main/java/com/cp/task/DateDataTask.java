package com.cp.task;


import com.cp.bean.Lottery;
import com.cp.bean.YearNum;
import com.cp.dao.AllPeriodMapper;
import com.cp.dao.LotteryMapper;
import com.cp.dao.YearNumMapper;
import com.cp.util.ChinaDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class DateDataTask {


    @Autowired
    private AllPeriodMapper allPeriodMapper;


    @Autowired
    private YearNumMapper yearNumMapper;

    @Autowired
    private LotteryMapper lotteryMapper;


    @Scheduled(cron = "1 10 * * * ?")
    public void initDate() throws Exception {
        List<YearNum> needProcess = yearNumMapper.listAll();

        if (CollectionUtils.isEmpty(needProcess)) {
            return;
        }
        for (YearNum process : needProcess) {
            processAllPeriod(process.getYear());
            // 设置为已处理
            process.setNum(1);
            yearNumMapper.updateByPrimaryKeySelective(process);
        }


    }


    private void processAllPeriod(String year) throws Exception {

        Map<String, List<Date>> days = getDatesByWeek(year);
        List<Date> d1s = days.get("星期一");
        List<Date> d3s = days.get("星期三");
        List<Date> d5s = days.get("星期五");

        d1s.addAll(d3s);
        d1s.addAll(d5s);

        d1s.sort((d1, d2) -> d1.after(d2) ? 1 : -1);

        converAllPeriod(d1s, year);

    }

    private void converAllPeriod(List<Date> d1s, String year) throws Exception {

        Lottery lottery;

        int index = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

        int lastYear = 0;

        Lottery lottery1 = lotteryMapper.getLastByYear(Integer.parseInt(year) - 1);

        if (null != lottery1) {
            lastYear = Integer.parseInt(lottery1.getPeriod().substring(4, 7));
        }

        int period;
        for (Date d1 : d1s) {
            lottery = new Lottery();

            String yinTm = ChinaDate.solarToLunar(sdf1.format(d1), false);

            if (year.equals(yinTm.substring(0, 4))) {
                index++;
                period = index;
            } else {
                lastYear++;
                period = lastYear;
            }

            lottery.setPeriod(yinTm.substring(0, 4) + "" + String.format("%03d", period));

            lottery.setEndFlag("-1");

            Date d2 = new Date(d1.getTime());
            d2.setHours(21);
            d2.setMinutes(00);

            lottery.setBeginTm(d2);

            Date d3 = new Date(d1.getTime());
            d3.setHours(21);
            d3.setMinutes(30);

            lottery.setEndTm(d3);
            lotteryMapper.insertSelective(lottery);
        }

    }


    public static Map<String, List<Date>> getDatesByWeek(String pyear) {

        Calendar c_begin = new GregorianCalendar();
        Calendar c_end = new GregorianCalendar();
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] weeks = dfs.getWeekdays();
        int year = Integer.parseInt(pyear);
        int month = 0;
        int day = 1;
        c_begin.set(year, month, day); //Calendar的月从0-11，
        c_end.set(year, 11, 31); //Calendar的月从0-11，
        List<Date> scheduledDates = new ArrayList<Date>();
        Map<String, List<Date>> map = new HashMap<String, List<Date>>();
        int count = 1;
        c_end.add(Calendar.DAY_OF_YEAR, 1);  //结束日期下滚一天是为了包含最后一天

        while (c_begin.before(c_end)) {
//       System.out.println("第"+count+"周  日期："+new java.sql.Date(c_begin.getTime().getTime())+","+weeks[c_begin.get(Calendar.DAY_OF_WEEK)]);
            String DAY_OF_WEEK = weeks[c_begin.get(Calendar.DAY_OF_WEEK)];

            Date date = c_begin.getTime();
            if (!map.containsKey(DAY_OF_WEEK)) {
                map.put(DAY_OF_WEEK, new ArrayList<Date>());
            }
            map.get(DAY_OF_WEEK).add(date);

            if (c_begin.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                count++;
            }
            c_begin.add(Calendar.DAY_OF_YEAR, 1);
        }

        return map;
    }

}
