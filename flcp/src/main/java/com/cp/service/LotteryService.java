package com.cp.service;

import cn.hutool.core.util.NumberUtil;
import com.cp.bean.Lottery;
import com.cp.bean.LotteryExample;
import com.cp.dao.BaseMapper;
import com.cp.dao.LotteryMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    public PageInfo<List<Lottery>> lotteryRecordListCommon(Map<String,Object> map){
        System.out.println(map);
        // 设置分页
        PageHelper.startPage(NumberUtil.parseInt(String.valueOf(map.get("page"))),NumberUtil.parseInt(String.valueOf(map.get("pageSize")))*7);
        List<Lottery> lotteries = mapper.lotteryRecordListCommon(map);
        PageInfo<List<Lottery>> pageInfo = new PageInfo(lotteries);
        pageInfo.setTotal(pageInfo.getTotal()/7);
        pageInfo.setPageSize(NumberUtil.parseInt(String.valueOf(map.get("pageSize"))));
        return pageInfo;
    }

    /**
     * 获取最后一个中奖信息和下一次开奖时间
     * @return
     */
    public List<Lottery> getNextLottery() {
        return mapper.getNextLottery();
    }
}