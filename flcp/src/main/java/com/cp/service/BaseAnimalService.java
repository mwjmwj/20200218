package com.cp.service;

import com.cp.bean.BaseAnimal;
import com.cp.bean.BaseAnimalExample;
import com.cp.dao.BaseAnimalMapper;
import com.cp.dao.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BaseAnimalService extends BaseService<BaseAnimalExample,BaseAnimal> {

    @Autowired
    private BaseAnimalMapper mapper;

    @Override
    @PostConstruct
    public void initMapper() {
        baseMapper = mapper;
    }
}