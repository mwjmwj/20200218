package com.fc.test.mapper.auto;

import com.fc.test.model.auto.Test;
import com.fc.test.model.auto.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 测试表 TestMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-21 10:04:45
 */
public interface TestMapper {
      	   	      	      	      	      
    long countByExample(TestExample example);

    int deleteByExample(TestExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestExample example);
		
    Test selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record, @Param("example") TestExample example); 
		
    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
  	  	
}