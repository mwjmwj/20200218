package com.fc.test.mapper.auto;

import com.fc.test.model.auto.AllPeriod;
import com.fc.test.model.auto.AllPeriodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  AllPeriodMapper
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:23:00
 */
public interface AllPeriodMapper {
      	   	      	      	      	      	      
    long countByExample(AllPeriodExample example);

    int deleteByExample(AllPeriodExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(AllPeriod record);

    int insertSelective(AllPeriod record);

    List<AllPeriod> selectByExample(AllPeriodExample example);
		
    AllPeriod selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") AllPeriod record, @Param("example") AllPeriodExample example);

    int updateByExample(@Param("record") AllPeriod record, @Param("example") AllPeriodExample example); 
		
    int updateByPrimaryKeySelective(AllPeriod record);

    int updateByPrimaryKey(AllPeriod record);
  	  	
}