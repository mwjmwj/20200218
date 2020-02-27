package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.TestMapper;
import com.fc.test.model.auto.Test;
import com.fc.test.model.auto.TestExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 * 测试表 TestService
 * @Title: TestService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-21 10:04:45  
 **/
@Service
public class TestService implements BaseService<Test, TestExample>{
	@Autowired
	private TestMapper testMapper;
	
      	   	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Test> list(Tablepar tablepar,String name){
	        TestExample testExample=new TestExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andNameLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<Test> list= testMapper.selectByExample(testExample);
	        PageInfo<Test> pageInfo = new PageInfo<Test>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			List<String> lista=Convert.toListStrArray(ids);
			TestExample example=new TestExample();
			example.createCriteria().andIdIn(lista);
			return testMapper.deleteByExample(example);
			
				
	}
	
	
	@Override
	public Test selectByPrimaryKey(String id) {
				
			return testMapper.selectByPrimaryKey(id);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(Test record) {
		return testMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Test record) {
				
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
			
				
		return testMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Test record, TestExample example) {
		
		return testMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Test record, TestExample example) {
		
		return testMapper.updateByExample(record, example);
	}

	@Override
	public List<Test> selectByExample(TestExample example) {
		
		return testMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(TestExample example) {
		
		return testMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(TestExample example) {
		
		return testMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param test
	 * @return
	 */
	public int checkNameUnique(Test test){
		TestExample example=new TestExample();
		example.createCriteria().andNameEqualTo(test.getName());
		List<Test> list=testMapper.selectByExample(example);
		return list.size();
	}


}
