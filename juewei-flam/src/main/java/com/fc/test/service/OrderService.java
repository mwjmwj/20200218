package com.fc.test.service;

import cn.hutool.core.convert.Convert;
import com.fc.test.mapper.auto.OrderMapper;
import com.fc.test.model.auto.Order;
import com.fc.test.model.auto.OrderExample;
import com.fc.test.util.Tablepar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 *  OrderService
 * @Title: OrderService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:03  
 **/
@Service
public class OrderService implements BaseService<Order, OrderExample>{
	@Autowired
	private OrderMapper orderMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @param status
	 * @return
	 */
	 public PageInfo<Order> list(Tablepar tablepar, String name, String status){
	        OrderExample testExample=new OrderExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andWechatIdEqualTo(name);
	        }
	        if(status!=null&&!"".equals(status)){
	        	testExample.createCriteria().andOStatusEqualTo(Integer.parseInt(status));
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<Order> list= orderMapper.selectByExample(testExample);
	        PageInfo<Order> pageInfo = new PageInfo<Order>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(ids.split(","));
			List<Long> stringB = Arrays.asList(integers);
			OrderExample example=new OrderExample();
			example.createCriteria().andIdIn(stringB);
			return orderMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public Order selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return orderMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(Order record) {
		return orderMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Order record) {
				
		record.setId(null);
		
				
		return orderMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Order record, OrderExample example) {
		
		return orderMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Order record, OrderExample example) {
		
		return orderMapper.updateByExample(record, example);
	}

	@Override
	public List<Order> selectByExample(OrderExample example) {
		
		return orderMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(OrderExample example) {
		
		return orderMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(OrderExample example) {
		
		return orderMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param order
	 * @return
	 */
	public int checkNameUnique(Order order){
		OrderExample example=new OrderExample();
		example.createCriteria().andOrderNoEqualTo(order.getOrderNo());
		List<Order> list=orderMapper.selectByExample(example);
		return list.size();
	}


}
