package com.fc.test.mapper.auto;

import com.fc.test.model.auto.Apprise;
import com.fc.test.model.auto.AppriseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  AppriseMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:21
 */
public interface AppriseMapper {
      	   	      	      	      	      	      	      	      	      
    long countByExample(AppriseExample example);

    int deleteByExample(AppriseExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(Apprise record);

    int insertSelective(Apprise record);

    List<Apprise> selectByExample(AppriseExample example);
		
    Apprise selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") Apprise record, @Param("example") AppriseExample example);

    int updateByExample(@Param("record") Apprise record, @Param("example") AppriseExample example); 
		
    int updateByPrimaryKeySelective(Apprise record);

    int updateByPrimaryKey(Apprise record);
  	  	
}