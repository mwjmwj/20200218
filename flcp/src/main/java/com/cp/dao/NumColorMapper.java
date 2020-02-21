package com.cp.dao;

import com.cp.bean.NumColor;
import com.cp.bean.NumColorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface NumColorMapper extends BaseMapper<NumColorExample,NumColor>{
    List<NumColor> listAll();

    /**
     * 获取数字颜色对应的生肖
     * @return
     */
    List<Map<String, Object>> getNumColorOnAnimals();
}