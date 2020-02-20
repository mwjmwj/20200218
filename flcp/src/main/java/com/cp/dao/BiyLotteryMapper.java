package com.cp.dao;

import com.cp.bean.BiyLottery;
import com.cp.bean.BiyLotteryExample;
import com.cp.bean.Lottery;

public interface BiyLotteryMapper extends BaseMapper<BiyLotteryExample,BiyLottery>{
    BiyLottery getLottery(String lottery);
}