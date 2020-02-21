package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.AllPeriodMapper;
import com.fc.test.model.auto.AllPeriod;
import com.fc.test.model.auto.AllPeriodExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 *  AllPeriodService
 * @Title: AllPeriodService.java 
 * @Package com.fc.test.service 
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:23:00  
 **/
@Service
public class AllPeriodService implements BaseService<AllPeriod, AllPeriodExample>{
	@Autowired
	private AllPeriodMapper allPeriodMapper;
	
      	   	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<AllPeriod> list(Tablepar tablepar,String name){
	        AllPeriodExample testExample=new AllPeriodExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andYangTmLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<AllPeriod> list= allPeriodMapper.selectByExample(testExample);
	        PageInfo<AllPeriod> pageInfo = new PageInfo<AllPeriod>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			AllPeriodExample example=new AllPeriodExample();
			example.createCriteria().andIdIn(stringB);
			return allPeriodMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public AllPeriod selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return allPeriodMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(AllPeriod record) {
		return allPeriodMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(AllPeriod record) {
				
		record.setId(null);
		
				
		return allPeriodMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(AllPeriod record, AllPeriodExample example) {
		
		return allPeriodMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(AllPeriod record, AllPeriodExample example) {
		
		return allPeriodMapper.updateByExample(record, example);
	}

	@Override
	public List<AllPeriod> selectByExample(AllPeriodExample example) {
		
		return allPeriodMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(AllPeriodExample example) {
		
		return allPeriodMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(AllPeriodExample example) {
		
		return allPeriodMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param allPeriod
	 * @return
	 */
	public int checkNameUnique(AllPeriod allPeriod){
		AllPeriodExample example=new AllPeriodExample();
		example.createCriteria().andYangTmEqualTo(allPeriod.getYangTm());
		List<AllPeriod> list=allPeriodMapper.selectByExample(example);
		return list.size();
	}


}
