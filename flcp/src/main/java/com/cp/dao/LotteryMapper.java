package com.cp.dao;

import com.cp.bean.Lottery;
import com.cp.bean.LotteryExample;

import java.util.List;

public interface LotteryMapper extends BaseMapper<LotteryExample,Lottery>{


    List<Lottery> listNotLottery();

    void startPeriod();

    Lottery getLastByYear(int i);
    List<Lottery> lotteryRecordListCommon(Map<String, Object> map);

    /**
     * 获取最后一个中级信息
     * @return
     */
    List<Lottery> getNextLottery();
}