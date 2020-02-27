package com.fc.test.service;

import cn.hutool.core.convert.Convert;
import com.fc.test.mapper.auto.GoodsTypeMapper;
import com.fc.test.model.auto.GoodsType;
import com.fc.test.model.auto.GoodsTypeExample;
import com.fc.test.util.Tablepar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 *  GoodsTypeService
 * @Title: GoodsTypeService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:57:41  
 **/
@Service
public class GoodsTypeService implements BaseService<GoodsType, GoodsTypeExample>{
	@Autowired
	private GoodsTypeMapper goodsTypeMapper;
	
      	   	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<GoodsType> list(Tablepar tablepar, String name){
	        GoodsTypeExample testExample=new GoodsTypeExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andNameLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<GoodsType> list= goodsTypeMapper.selectByExample(testExample);
	        PageInfo<GoodsType> pageInfo = new PageInfo<GoodsType>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(ids.split(","));
			List<Long> stringB = Arrays.asList(integers);
			GoodsTypeExample example=new GoodsTypeExample();
			example.createCriteria().andIdIn(stringB);
			return goodsTypeMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public GoodsType selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return goodsTypeMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(GoodsType record) {
		return goodsTypeMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(GoodsType record) {
				
		record.setId(null);
		
				
		return goodsTypeMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(GoodsType record, GoodsTypeExample example) {
		
		return goodsTypeMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(GoodsType record, GoodsTypeExample example) {
		
		return goodsTypeMapper.updateByExample(record, example);
	}

	@Override
	public List<GoodsType> selectByExample(GoodsTypeExample example) {
		
		return goodsTypeMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(GoodsTypeExample example) {
		
		return goodsTypeMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(GoodsTypeExample example) {
		
		return goodsTypeMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param goodsType
	 * @return
	 */
	public int checkNameUnique(GoodsType goodsType){
		GoodsTypeExample example=new GoodsTypeExample();
		example.createCriteria().andNameEqualTo(goodsType.getName());
		List<GoodsType> list=goodsTypeMapper.selectByExample(example);
		return list.size();
	}


}
