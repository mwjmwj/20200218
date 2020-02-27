package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ShopCar;
import com.fc.test.model.auto.ShopCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  ShopCarMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:52:19
 */
public interface ShopCarMapper {
      	   	      	      	      	      	      	      	      
    long countByExample(ShopCarExample example);

    int deleteByExample(ShopCarExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(ShopCar record);

    int insertSelective(ShopCar record);

    List<ShopCar> selectByExample(ShopCarExample example);
		
    ShopCar selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") ShopCar record, @Param("example") ShopCarExample example);

    int updateByExample(@Param("record") ShopCar record, @Param("example") ShopCarExample example); 
		
    int updateByPrimaryKeySelective(ShopCar record);

    int updateByPrimaryKey(ShopCar record);
  	  	
}