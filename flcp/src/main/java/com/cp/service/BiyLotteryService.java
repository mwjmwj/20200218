package com.cp.service;

import com.cp.bean.BiyLottery;
import com.cp.bean.BiyLotteryExample;
import com.cp.bean.Lottery;
import com.cp.dao.BiyLotteryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BiyLotteryService extends BaseService<BiyLotteryExample,BiyLottery> {

    @Autowired
    private BiyLotteryMapper mapper;

    @Override
    @PostConstruct
    public void initMapper() {
        baseMapper = mapper;
    }


    public BiyLottery getLottery(String period) {

    return mapper.getLottery(period);
    }
}