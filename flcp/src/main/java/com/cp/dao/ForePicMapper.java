package com.cp.dao;

import com.cp.bean.ForePic;
import com.cp.bean.ForePicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 图库表 ForePicMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-21 16:04:02
 */
public interface ForePicMapper {
      	   	      	      	      	      
    long countByExample(ForePicExample example);

    int deleteByExample(ForePicExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(ForePic record);

    int insertSelective(ForePic record);

    List<ForePic> selectByExample(ForePicExample example);

    List<ForePic> indexPicList();

    ForePic selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") ForePic record, @Param("example") ForePicExample example);

    int updateByExample(@Param("record") ForePic record, @Param("example") ForePicExample example); 
		
    int updateByPrimaryKeySelective(ForePic record);

    int updateByPrimaryKey(ForePic record);
  	  	
}