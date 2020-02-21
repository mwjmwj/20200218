package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.BaseAnimalMapper;
import com.fc.test.model.auto.BaseAnimal;
import com.fc.test.model.auto.BaseAnimalExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 * 动物 BaseAnimalService
 * @Title: BaseAnimalService.java 
 * @Package com.fc.test.service 
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:22:40  
 **/
@Service
public class BaseAnimalService implements BaseService<BaseAnimal, BaseAnimalExample>{
	@Autowired
	private BaseAnimalMapper baseAnimalMapper;
	
      	   	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<BaseAnimal> list(Tablepar tablepar,String name){
	        BaseAnimalExample testExample=new BaseAnimalExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andNameLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<BaseAnimal> list= baseAnimalMapper.selectByExample(testExample);
	        PageInfo<BaseAnimal> pageInfo = new PageInfo<BaseAnimal>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			BaseAnimalExample example=new BaseAnimalExample();
			example.createCriteria().andIdIn(stringB);
			return baseAnimalMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public BaseAnimal selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return baseAnimalMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(BaseAnimal record) {
		return baseAnimalMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(BaseAnimal record) {
				
		record.setId(null);
		
				
		return baseAnimalMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(BaseAnimal record, BaseAnimalExample example) {
		
		return baseAnimalMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(BaseAnimal record, BaseAnimalExample example) {
		
		return baseAnimalMapper.updateByExample(record, example);
	}

	@Override
	public List<BaseAnimal> selectByExample(BaseAnimalExample example) {
		
		return baseAnimalMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(BaseAnimalExample example) {
		
		return baseAnimalMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(BaseAnimalExample example) {
		
		return baseAnimalMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param baseAnimal
	 * @return
	 */
	public int checkNameUnique(BaseAnimal baseAnimal){
		BaseAnimalExample example=new BaseAnimalExample();
		example.createCriteria().andNameEqualTo(baseAnimal.getName());
		List<BaseAnimal> list=baseAnimalMapper.selectByExample(example);
		return list.size();
	}


}
