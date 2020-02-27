package com.fc.test.service;

import cn.hutool.core.convert.Convert;
import com.fc.test.mapper.auto.GoodsDetailMapper;
import com.fc.test.model.auto.GoodsDetail;
import com.fc.test.model.auto.GoodsDetailExample;
import com.fc.test.util.Tablepar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 *  GoodsDetailService
 * @Title: GoodsDetailService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:57:26  
 **/
@Service
public class GoodsDetailService implements BaseService<GoodsDetail, GoodsDetailExample>{
	@Autowired
	private GoodsDetailMapper goodsDetailMapper;
	
      	   	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<GoodsDetail> list(Tablepar tablepar, String name){
	        GoodsDetailExample testExample=new GoodsDetailExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andNameDescLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<GoodsDetail> list= goodsDetailMapper.selectByExample(testExample);
	        PageInfo<GoodsDetail> pageInfo = new PageInfo<GoodsDetail>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(ids.split(","));
			List<Long> stringB = Arrays.asList(integers);
			GoodsDetailExample example=new GoodsDetailExample();
			example.createCriteria().andIdIn(stringB);
			return goodsDetailMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public GoodsDetail selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return goodsDetailMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(GoodsDetail record) {
		return goodsDetailMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(GoodsDetail record) {
				
		record.setId(null);
		
				
		return goodsDetailMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(GoodsDetail record, GoodsDetailExample example) {
		
		return goodsDetailMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(GoodsDetail record, GoodsDetailExample example) {
		
		return goodsDetailMapper.updateByExample(record, example);
	}

	@Override
	public List<GoodsDetail> selectByExample(GoodsDetailExample example) {
		
		return goodsDetailMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(GoodsDetailExample example) {
		
		return goodsDetailMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(GoodsDetailExample example) {
		
		return goodsDetailMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param goodsDetail
	 * @return
	 */
	public int checkNameUnique(GoodsDetail goodsDetail){
		GoodsDetailExample example=new GoodsDetailExample();
		example.createCriteria().andNameDescEqualTo(goodsDetail.getNameDesc());
		List<GoodsDetail> list=goodsDetailMapper.selectByExample(example);
		return list.size();
	}


}
