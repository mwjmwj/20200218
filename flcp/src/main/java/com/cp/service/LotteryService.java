package com.cp.service;

import com.cp.bean.Lottery;
import com.cp.bean.LotteryExample;
import com.cp.dao.BaseMapper;
import com.cp.dao.LotteryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LotteryService extends BaseService<LotteryExample,Lottery> {


    @Autowired
    private LotteryMapper mapper;

    @Override
    public void initMapper() {
        baseMapper = mapper;
    }

    public List<Lottery> listNotLottery() {
        return mapper.listNotLottery();
    }
}