package com.cp.dao;

import com.cp.bean.NumColor;
import com.cp.bean.NumColorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NumColorMapper extends BaseMapper<NumColorExample,NumColor>{
    List<NumColor> listAll();
}