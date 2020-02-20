package com.cp.dao;

import com.cp.bean.BiyLottery;
import com.cp.bean.BiyLotteryExample;
import com.cp.bean.Lottery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BiyLotteryMapper extends BaseMapper<BiyLotteryExample,BiyLottery>{
    BiyLottery getLottery(String lottery);
    /**
     * 特码走势图
     * @param lotteryYear
     * @return
     */
    List<BiyLottery> getSpecialCodeTrendChart(@Param("lotteryYear") String lotteryYear);
}