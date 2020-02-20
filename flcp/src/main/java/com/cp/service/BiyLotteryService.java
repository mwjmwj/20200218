package com.cp.service;

import com.cp.bean.BiyLottery;
import com.cp.bean.BiyLotteryExample;
import com.cp.dao.BiyLotteryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiyLotteryService extends BaseService<BiyLotteryExample,BiyLottery> {

    @Autowired
    private BiyLotteryMapper mapper;

    @Override
    public void initMapper() {
        baseMapper = mapper;
    }

    /**
     * 特码走势图
     * @param lotteryYear
     * @return
     */
    public List<BiyLottery> getSpecialCodeTrendChart(String lotteryYear) {
        return mapper.getSpecialCodeTrendChart(lotteryYear);
    }
}