package com.fc.test.mapper.auto;

import com.fc.test.model.auto.YearNum;
import com.fc.test.model.auto.YearNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 年份数字 YearNumMapper
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:24:10
 */
public interface YearNumMapper {
      	   	      	      	      
    long countByExample(YearNumExample example);

    int deleteByExample(YearNumExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(YearNum record);

    int insertSelective(YearNum record);

    List<YearNum> selectByExample(YearNumExample example);
		
    YearNum selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") YearNum record, @Param("example") YearNumExample example);

    int updateByExample(@Param("record") YearNum record, @Param("example") YearNumExample example); 
		
    int updateByPrimaryKeySelective(YearNum record);

    int updateByPrimaryKey(YearNum record);
  	  	
}