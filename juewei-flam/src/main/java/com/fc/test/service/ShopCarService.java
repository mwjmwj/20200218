package com.fc.test.service;

import cn.hutool.core.convert.Convert;
import com.fc.test.mapper.auto.ShopCarMapper;
import com.fc.test.model.auto.ShopCar;
import com.fc.test.model.auto.ShopCarExample;
import com.fc.test.util.Tablepar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 *  ShopCarService
 * @Title: ShopCarService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:52:19  
 **/
@Service
public class ShopCarService implements BaseService<ShopCar, ShopCarExample>{
	@Autowired
	private ShopCarMapper shopCarMapper;
	
      	   	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ShopCar> list(Tablepar tablepar, String name){
	        ShopCarExample testExample=new ShopCarExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andWechatIdLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ShopCar> list= shopCarMapper.selectByExample(testExample);
	        PageInfo<ShopCar> pageInfo = new PageInfo<ShopCar>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(ids.split(","));
			List<Long> stringB = Arrays.asList(integers);
			ShopCarExample example=new ShopCarExample();
			example.createCriteria().andIdIn(stringB);
			return shopCarMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public ShopCar selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return shopCarMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(ShopCar record) {
		return shopCarMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ShopCar record) {
				
		record.setId(null);
		
				
		return shopCarMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(ShopCar record, ShopCarExample example) {
		
		return shopCarMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ShopCar record, ShopCarExample example) {
		
		return shopCarMapper.updateByExample(record, example);
	}

	@Override
	public List<ShopCar> selectByExample(ShopCarExample example) {
		
		return shopCarMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ShopCarExample example) {
		
		return shopCarMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ShopCarExample example) {
		
		return shopCarMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param shopCar
	 * @return
	 */
	public int checkNameUnique(ShopCar shopCar){
		ShopCarExample example=new ShopCarExample();
		example.createCriteria().andWechatIdEqualTo(shopCar.getWechatId());
		List<ShopCar> list=shopCarMapper.selectByExample(example);
		return list.size();
	}


}
