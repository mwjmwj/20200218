package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.YearNumMapper;
import com.fc.test.model.auto.YearNum;
import com.fc.test.model.auto.YearNumExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 * 年份数字 YearNumService
 * @Title: YearNumService.java 
 * @Package com.fc.test.service 
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:24:10  
 **/
@Service
public class YearNumService implements BaseService<YearNum, YearNumExample>{
	@Autowired
	private YearNumMapper yearNumMapper;
	
      	   	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<YearNum> list(Tablepar tablepar,String name){
	        YearNumExample testExample=new YearNumExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andYearLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<YearNum> list= yearNumMapper.selectByExample(testExample);
	        PageInfo<YearNum> pageInfo = new PageInfo<YearNum>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			YearNumExample example=new YearNumExample();
			example.createCriteria().andIdIn(stringB);
			return yearNumMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public YearNum selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return yearNumMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(YearNum record) {
		return yearNumMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(YearNum record) {
				
		record.setId(null);
		
				
		return yearNumMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(YearNum record, YearNumExample example) {
		
		return yearNumMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(YearNum record, YearNumExample example) {
		
		return yearNumMapper.updateByExample(record, example);
	}

	@Override
	public List<YearNum> selectByExample(YearNumExample example) {
		
		return yearNumMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(YearNumExample example) {
		
		return yearNumMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(YearNumExample example) {
		
		return yearNumMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param yearNum
	 * @return
	 */
	public int checkNameUnique(YearNum yearNum){
		YearNumExample example=new YearNumExample();
		example.createCriteria().andYearEqualTo(yearNum.getYear());
		List<YearNum> list=yearNumMapper.selectByExample(example);
		return list.size();
	}


}
