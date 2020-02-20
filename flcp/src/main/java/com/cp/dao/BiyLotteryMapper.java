package com.cp.dao;

import com.cp.bean.BiyLottery;
import com.cp.bean.BiyLotteryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BiyLotteryMapper extends BaseMapper<BiyLotteryExample,BiyLottery>{
    /**
     * 特码走势图
     * @param lotteryYear
     * @return
     */
    List<BiyLottery> getSpecialCodeTrendChart(@Param("lotteryYear") String lotteryYear);
}