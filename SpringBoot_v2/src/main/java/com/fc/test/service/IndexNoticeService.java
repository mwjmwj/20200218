package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.IndexNoticeMapper;
import com.fc.test.model.auto.IndexNotice;
import com.fc.test.model.auto.IndexNoticeExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 * 首页公告表 IndexNoticeService
 * @Title: IndexNoticeService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-22 11:54:16  
 **/
@Service
public class IndexNoticeService implements BaseService<IndexNotice, IndexNoticeExample>{
	@Autowired
	private IndexNoticeMapper indexNoticeMapper;
	
      	   	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<IndexNotice> list(Tablepar tablepar,String name){
	        IndexNoticeExample testExample=new IndexNoticeExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andCompanyNoticeLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<IndexNotice> list= indexNoticeMapper.selectByExample(testExample);
	        PageInfo<IndexNotice> pageInfo = new PageInfo<IndexNotice>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			IndexNoticeExample example=new IndexNoticeExample();
			example.createCriteria().andIdIn(stringB);
			return indexNoticeMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public IndexNotice selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return indexNoticeMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(IndexNotice record) {
		return indexNoticeMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(IndexNotice record) {
				
		record.setId(null);
		
				
		return indexNoticeMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(IndexNotice record, IndexNoticeExample example) {
		
		return indexNoticeMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(IndexNotice record, IndexNoticeExample example) {
		
		return indexNoticeMapper.updateByExample(record, example);
	}

	@Override
	public List<IndexNotice> selectByExample(IndexNoticeExample example) {
		
		return indexNoticeMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(IndexNoticeExample example) {
		
		return indexNoticeMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(IndexNoticeExample example) {
		
		return indexNoticeMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param indexNotice
	 * @return
	 */
	public int checkNameUnique(IndexNotice indexNotice){
		IndexNoticeExample example=new IndexNoticeExample();
		example.createCriteria().andCompanyNoticeEqualTo(indexNotice.getCompanyNotice());
		List<IndexNotice> list=indexNoticeMapper.selectByExample(example);
		return list.size();
	}


}
