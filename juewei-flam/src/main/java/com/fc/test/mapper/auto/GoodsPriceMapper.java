package com.fc.test.mapper.auto;

import com.fc.test.model.auto.GoodsPrice;
import com.fc.test.model.auto.GoodsPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  GoodsPriceMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:57:11
 */
public interface GoodsPriceMapper {
      	   	      	      	      	      	      
    long countByExample(GoodsPriceExample example);

    int deleteByExample(GoodsPriceExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(GoodsPrice record);

    int insertSelective(GoodsPrice record);

    List<GoodsPrice> selectByExample(GoodsPriceExample example);
		
    GoodsPrice selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") GoodsPrice record, @Param("example") GoodsPriceExample example);

    int updateByExample(@Param("record") GoodsPrice record, @Param("example") GoodsPriceExample example); 
		
    int updateByPrimaryKeySelective(GoodsPrice record);

    int updateByPrimaryKey(GoodsPrice record);
  	  	
}