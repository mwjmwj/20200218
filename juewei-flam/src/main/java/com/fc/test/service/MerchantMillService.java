package com.fc.test.service;

import cn.hutool.core.convert.Convert;
import com.fc.test.mapper.auto.MerchantMillMapper;
import com.fc.test.model.auto.MerchantMill;
import com.fc.test.model.auto.MerchantMillExample;
import com.fc.test.util.Tablepar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 *  MerchantMillService
 * @Title: MerchantMillService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:38  
 **/
@Service
public class MerchantMillService implements BaseService<MerchantMill, MerchantMillExample>{
	@Autowired
	private MerchantMillMapper merchantMillMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<MerchantMill> list(Tablepar tablepar, String name){
	        MerchantMillExample testExample=new MerchantMillExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andNameLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<MerchantMill> list= merchantMillMapper.selectByExample(testExample);
	        PageInfo<MerchantMill> pageInfo = new PageInfo<MerchantMill>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(ids.split(","));
			List<Long> stringB = Arrays.asList(integers);
			MerchantMillExample example=new MerchantMillExample();
			example.createCriteria().andIdIn(stringB);
			return merchantMillMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public MerchantMill selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return merchantMillMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(MerchantMill record) {
		return merchantMillMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(MerchantMill record) {
				
		record.setId(null);
		
				
		return merchantMillMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(MerchantMill record, MerchantMillExample example) {
		
		return merchantMillMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(MerchantMill record, MerchantMillExample example) {
		
		return merchantMillMapper.updateByExample(record, example);
	}

	@Override
	public List<MerchantMill> selectByExample(MerchantMillExample example) {
		
		return merchantMillMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(MerchantMillExample example) {
		
		return merchantMillMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(MerchantMillExample example) {
		
		return merchantMillMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param merchantMill
	 * @return
	 */
	public int checkNameUnique(MerchantMill merchantMill){
		MerchantMillExample example=new MerchantMillExample();
		example.createCriteria().andNameEqualTo(merchantMill.getName());
		List<MerchantMill> list=merchantMillMapper.selectByExample(example);
		return list.size();
	}


}
