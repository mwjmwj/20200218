package com.fc.test.service;

import cn.hutool.core.convert.Convert;
import com.fc.test.mapper.auto.AppriseMapper;
import com.fc.test.model.auto.Apprise;
import com.fc.test.model.auto.AppriseExample;
import com.fc.test.util.Tablepar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 *  AppriseService
 * @Title: AppriseService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:21  
 **/
@Service
public class AppriseService implements BaseService<Apprise, AppriseExample> {
	@Autowired
	private AppriseMapper appriseMapper;
	
      	   	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Apprise> list(Tablepar tablepar, String name){
	        AppriseExample testExample=new AppriseExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andWechatNameLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<Apprise> list= appriseMapper.selectByExample(testExample);
	        PageInfo<Apprise> pageInfo = new PageInfo<Apprise>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(ids.split(","));
			List<Long> stringB = Arrays.asList(integers);
			AppriseExample example=new AppriseExample();
			example.createCriteria().andIdIn(stringB);
			return appriseMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public Apprise selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return appriseMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(Apprise record) {
		return appriseMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Apprise record) {
				
		record.setId(null);
		
				
		return appriseMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Apprise record, AppriseExample example) {
		
		return appriseMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Apprise record, AppriseExample example) {
		
		return appriseMapper.updateByExample(record, example);
	}

	@Override
	public List<Apprise> selectByExample(AppriseExample example) {
		
		return appriseMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(AppriseExample example) {
		
		return appriseMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(AppriseExample example) {
		
		return appriseMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param apprise
	 * @return
	 */
	public int checkNameUnique(Apprise apprise){
		AppriseExample example=new AppriseExample();
		example.createCriteria().andOrderIdEqualTo(apprise.getOrderId());
		List<Apprise> list=appriseMapper.selectByExample(example);
		return list.size();
	}


}
