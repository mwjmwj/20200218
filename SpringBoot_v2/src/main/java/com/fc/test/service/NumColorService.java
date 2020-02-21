package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.NumColorMapper;
import com.fc.test.model.auto.NumColor;
import com.fc.test.model.auto.NumColorExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 *  NumColorService
 * @Title: NumColorService.java 
 * @Package com.fc.test.service 
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:23:57  
 **/
@Service
public class NumColorService implements BaseService<NumColor, NumColorExample>{
	@Autowired
	private NumColorMapper numColorMapper;
	
      	   	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<NumColor> list(Tablepar tablepar,String name){
	        NumColorExample testExample=new NumColorExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andNumLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<NumColor> list= numColorMapper.selectByExample(testExample);
	        PageInfo<NumColor> pageInfo = new PageInfo<NumColor>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			NumColorExample example=new NumColorExample();
			example.createCriteria().andIdIn(stringB);
			return numColorMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public NumColor selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return numColorMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(NumColor record) {
		return numColorMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(NumColor record) {
				
		record.setId(null);
		
				
		return numColorMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(NumColor record, NumColorExample example) {
		
		return numColorMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(NumColor record, NumColorExample example) {
		
		return numColorMapper.updateByExample(record, example);
	}

	@Override
	public List<NumColor> selectByExample(NumColorExample example) {
		
		return numColorMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(NumColorExample example) {
		
		return numColorMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(NumColorExample example) {
		
		return numColorMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param numColor
	 * @return
	 */
	public int checkNameUnique(NumColor numColor){
		NumColorExample example=new NumColorExample();
		example.createCriteria().andNumEqualTo(numColor.getNum());
		List<NumColor> list=numColorMapper.selectByExample(example);
		return list.size();
	}


}
