package com.fc.test.mapper.auto;

import com.fc.test.model.auto.NumColor;
import com.fc.test.model.auto.NumColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  NumColorMapper
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:23:57
 */
public interface NumColorMapper {
      	   	      	      	      	      	      
    long countByExample(NumColorExample example);

    int deleteByExample(NumColorExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(NumColor record);

    int insertSelective(NumColor record);

    List<NumColor> selectByExample(NumColorExample example);
		
    NumColor selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") NumColor record, @Param("example") NumColorExample example);

    int updateByExample(@Param("record") NumColor record, @Param("example") NumColorExample example); 
		
    int updateByPrimaryKeySelective(NumColor record);

    int updateByPrimaryKey(NumColor record);
  	  	
}