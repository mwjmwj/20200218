package com.cp.service;

import com.cp.bean.LotteryDetail;
import com.cp.bean.LotteryDetailExample;
import com.cp.dao.BaseMapper;
import com.cp.dao.BiyLotteryMapper;
import com.cp.dao.LotteryDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LotteryDetailService extends BaseService<LotteryDetailExample,LotteryDetail> {

    @Autowired
    private LotteryDetailMapper mapper;

    @Override
    public void initMapper() {
        baseMapper = mapper;
    }

}