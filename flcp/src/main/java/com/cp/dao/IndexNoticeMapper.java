package com.cp.dao;

import com.cp.bean.IndexNotice;
import com.cp.bean.IndexNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 首页公告表 IndexNoticeMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-21 16:04:10
 */
public interface IndexNoticeMapper {
      	   	      	      	      	      	      	      
    long countByExample(IndexNoticeExample example);

    int deleteByExample(IndexNoticeExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(IndexNotice record);

    int insertSelective(IndexNotice record);

    List<IndexNotice> selectByExample(IndexNoticeExample example);
		
    IndexNotice selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") IndexNotice record, @Param("example") IndexNoticeExample example);

    int updateByExample(@Param("record") IndexNotice record, @Param("example") IndexNoticeExample example); 
		
    int updateByPrimaryKeySelective(IndexNotice record);

    int updateByPrimaryKey(IndexNotice record);
  	  	
}