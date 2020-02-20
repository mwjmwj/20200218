package com.cp.dao;

import com.cp.bean.YearNum;
import com.cp.bean.YearNumExample;

import java.util.List;

public interface YearNumMapper extends BaseMapper<YearNumExample,YearNum>{
    List<YearNum> listAll();
}