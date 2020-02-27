package com.fc.test.mapper.auto;

import com.fc.test.model.auto.GoodsQty;
import com.fc.test.model.auto.GoodsQtyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  GoodsQtyMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:59
 */
public interface GoodsQtyMapper {
      	   	      	      	      	      	      
    long countByExample(GoodsQtyExample example);

    int deleteByExample(GoodsQtyExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(GoodsQty record);

    int insertSelective(GoodsQty record);

    List<GoodsQty> selectByExample(GoodsQtyExample example);
		
    GoodsQty selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") GoodsQty record, @Param("example") GoodsQtyExample example);

    int updateByExample(@Param("record") GoodsQty record, @Param("example") GoodsQtyExample example); 
		
    int updateByPrimaryKeySelective(GoodsQty record);

    int updateByPrimaryKey(GoodsQty record);
  	  	
}