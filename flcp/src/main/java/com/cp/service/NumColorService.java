package com.cp.service;

import com.cp.bean.NumColor;
import com.cp.bean.NumColorExample;
import com.cp.dao.NumColorMapper;
import com.cp.util.tools.ColorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NumColorService extends BaseService<NumColorExample, NumColor>  {

    @Autowired
    private NumColorMapper numColorMapper;

    @Override
    public void initMapper() {
        baseMapper = numColorMapper;
    }

    public List<NumColor> listAll(){
        List<NumColor> lists = numColorMapper.listAll();
        lists.forEach(numColor -> {
            numColor.setColorCode(ColorEnum.getColorCode(numColor.getColor()));
        });
        return lists;
    }

    /**
     * 数字颜色对应的生肖
     * @return
     */
    public List<Map<String, Object>> getNumColorOnAnimals() {
        return numColorMapper.getNumColorOnAnimals();
    }
}
