package com.cp.service;

import com.cp.bean.YearNum;
import com.cp.bean.YearNumExample;
import com.cp.dao.YearNumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class YearNumService extends BaseService<YearNumExample,YearNum> {

    @Autowired
    private YearNumMapper mapper;

    @Override
    @PostConstruct
    public void initMapper() {
        baseMapper = mapper;
    }

}