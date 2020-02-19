package com.cp.service;

import com.cp.bean.BiyLottery;
import com.cp.bean.BiyLotteryExample;
import com.cp.dao.BiyLotteryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BiyLotteryService extends BaseService<BiyLotteryExample,BiyLottery> {

    @Autowired
    private BiyLotteryMapper mapper;

    @Override
    public void initMapper() {
        baseMapper = mapper;
    }


}