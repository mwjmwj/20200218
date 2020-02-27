package com.fc.test.service;

import cn.hutool.core.convert.Convert;
import com.fc.test.mapper.auto.GoodsPriceMapper;
import com.fc.test.model.auto.GoodsPrice;
import com.fc.test.model.auto.GoodsPriceExample;
import com.fc.test.util.Tablepar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 *  GoodsPriceService
 * @Title: GoodsPriceService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:57:11  
 **/
@Service
public class GoodsPriceService implements BaseService<GoodsPrice, GoodsPriceExample>{
	@Autowired
	private GoodsPriceMapper goodsPriceMapper;
	
      	   	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<GoodsPrice> list(Tablepar tablepar, String name){
	        GoodsPriceExample testExample=new GoodsPriceExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andGoodsIdIn(null);
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<GoodsPrice> list= goodsPriceMapper.selectByExample(testExample);
	        PageInfo<GoodsPrice> pageInfo = new PageInfo<GoodsPrice>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(ids.split(","));
			List<Long> stringB = Arrays.asList(integers);
			GoodsPriceExample example=new GoodsPriceExample();
			example.createCriteria().andIdIn(stringB);
			return goodsPriceMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public GoodsPrice selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return goodsPriceMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(GoodsPrice record) {
		return goodsPriceMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(GoodsPrice record) {
				
		record.setId(null);
		
				
		return goodsPriceMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(GoodsPrice record, GoodsPriceExample example) {
		
		return goodsPriceMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(GoodsPrice record, GoodsPriceExample example) {
		
		return goodsPriceMapper.updateByExample(record, example);
	}

	@Override
	public List<GoodsPrice> selectByExample(GoodsPriceExample example) {
		
		return goodsPriceMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(GoodsPriceExample example) {
		
		return goodsPriceMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(GoodsPriceExample example) {
		
		return goodsPriceMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param goodsPrice
	 * @return
	 */
	public int checkNameUnique(GoodsPrice goodsPrice){
		GoodsPriceExample example=new GoodsPriceExample();
		example.createCriteria().andGoodsIdEqualTo(goodsPrice.getGoodsId());
		List<GoodsPrice> list=goodsPriceMapper.selectByExample(example);
		return list.size();
	}


}
