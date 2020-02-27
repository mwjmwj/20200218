package com.fc.test.mapper.auto;

import com.fc.test.model.auto.GoodsDetail;
import com.fc.test.model.auto.GoodsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  GoodsDetailMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:57:26
 */
public interface GoodsDetailMapper {
      	   	      	      	      	      	      	      	      
    long countByExample(GoodsDetailExample example);

    int deleteByExample(GoodsDetailExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(GoodsDetail record);

    int insertSelective(GoodsDetail record);

    List<GoodsDetail> selectByExample(GoodsDetailExample example);
		
    GoodsDetail selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") GoodsDetail record, @Param("example") GoodsDetailExample example);

    int updateByExample(@Param("record") GoodsDetail record, @Param("example") GoodsDetailExample example); 
		
    int updateByPrimaryKeySelective(GoodsDetail record);

    int updateByPrimaryKey(GoodsDetail record);
  	  	
}