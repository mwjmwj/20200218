package com.fc.test.mapper.auto;

import com.fc.test.model.auto.BaseAnimal;
import com.fc.test.model.auto.BaseAnimalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 动物 BaseAnimalMapper
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:22:40
 */
public interface BaseAnimalMapper {
      	   	      	      	      	      	      	      	      
    long countByExample(BaseAnimalExample example);

    int deleteByExample(BaseAnimalExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(BaseAnimal record);

    int insertSelective(BaseAnimal record);

    List<BaseAnimal> selectByExample(BaseAnimalExample example);
		
    BaseAnimal selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") BaseAnimal record, @Param("example") BaseAnimalExample example);

    int updateByExample(@Param("record") BaseAnimal record, @Param("example") BaseAnimalExample example); 
		
    int updateByPrimaryKeySelective(BaseAnimal record);

    int updateByPrimaryKey(BaseAnimal record);
  	  	
}