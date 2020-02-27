package com.fc.test.service;

import cn.hutool.core.convert.Convert;
import com.fc.test.mapper.auto.GoodsQtyMapper;
import com.fc.test.model.auto.GoodsQty;
import com.fc.test.model.auto.GoodsQtyExample;
import com.fc.test.util.Tablepar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 *  GoodsQtyService
 * @Title: GoodsQtyService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:59  
 **/
@Service
public class GoodsQtyService implements BaseService<GoodsQty, GoodsQtyExample>{
	@Autowired
	private GoodsQtyMapper goodsQtyMapper;
	
      	   	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<GoodsQty> list(Tablepar tablepar, String name){
	        GoodsQtyExample testExample=new GoodsQtyExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
//	        	testExample.createCriteria().andGoodsIdLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<GoodsQty> list= goodsQtyMapper.selectByExample(testExample);
	        PageInfo<GoodsQty> pageInfo = new PageInfo<GoodsQty>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(ids.split(","));
			List<Long> stringB = Arrays.asList(integers);
			GoodsQtyExample example=new GoodsQtyExample();
			example.createCriteria().andIdIn(stringB);
			return goodsQtyMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public GoodsQty selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return goodsQtyMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(GoodsQty record) {
		return goodsQtyMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(GoodsQty record) {
				
		record.setId(null);
		
				
		return goodsQtyMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(GoodsQty record, GoodsQtyExample example) {
		
		return goodsQtyMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(GoodsQty record, GoodsQtyExample example) {
		
		return goodsQtyMapper.updateByExample(record, example);
	}

	@Override
	public List<GoodsQty> selectByExample(GoodsQtyExample example) {
		
		return goodsQtyMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(GoodsQtyExample example) {
		
		return goodsQtyMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(GoodsQtyExample example) {
		
		return goodsQtyMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param goodsQty
	 * @return
	 */
	public int checkNameUnique(GoodsQty goodsQty){
		GoodsQtyExample example=new GoodsQtyExample();
		example.createCriteria().andGoodsIdEqualTo(goodsQty.getGoodsId());
		List<GoodsQty> list=goodsQtyMapper.selectByExample(example);
		return list.size();
	}


}
