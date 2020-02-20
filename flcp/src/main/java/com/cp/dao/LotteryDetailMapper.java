package com.cp.dao;

import com.cp.bean.LotteryDetail;
import com.cp.bean.LotteryDetailExample;

import java.util.List;

public interface LotteryDetailMapper extends BaseMapper<LotteryDetailExample,LotteryDetail>{
    List<LotteryDetail> listDetail(Long lId);
}