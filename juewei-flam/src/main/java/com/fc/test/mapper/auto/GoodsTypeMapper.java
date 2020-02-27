package com.fc.test.mapper.auto;

import com.fc.test.model.auto.GoodsType;
import com.fc.test.model.auto.GoodsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  GoodsTypeMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:57:41
 */
public interface GoodsTypeMapper {
      	   	      	      	      	      	      
    long countByExample(GoodsTypeExample example);

    int deleteByExample(GoodsTypeExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    List<GoodsType> selectByExample(GoodsTypeExample example);
		
    GoodsType selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    int updateByExample(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example); 
		
    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
  	  	
}