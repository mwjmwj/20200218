package com.fc.test.mapper.auto;

import com.fc.test.model.auto.ForePic;
import com.fc.test.model.auto.ForePicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 图库表 ForePicMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-22 11:54:23
 */
public interface ForePicMapper {
      	   	      	      	      	      
    long countByExample(ForePicExample example);

    int deleteByExample(ForePicExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(ForePic record);

    int insertSelective(ForePic record);

    List<ForePic> selectByExample(ForePicExample example);
		
    ForePic selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") ForePic record, @Param("example") ForePicExample example);

    int updateByExample(@Param("record") ForePic record, @Param("example") ForePicExample example); 
		
    int updateByPrimaryKeySelective(ForePic record);

    int updateByPrimaryKey(ForePic record);
  	  	
}