package com.cp.dao;

import com.cp.bean.BaseAnimal;
import com.cp.bean.BaseAnimalExample;

import java.util.List;

public interface BaseAnimalMapper extends BaseMapper<BaseAnimalExample,BaseAnimal>{
    List<BaseAnimal> listAll();
}