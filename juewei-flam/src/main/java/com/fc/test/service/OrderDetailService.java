package com.fc.test.service;

import cn.hutool.core.convert.Convert;
import com.fc.test.mapper.auto.OrderDetailMapper;
import com.fc.test.model.auto.OrderDetail;
import com.fc.test.model.auto.OrderDetailExample;
import com.fc.test.util.Tablepar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 *  OrderDetailService
 * @Title: OrderDetailService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:52:50  
 **/
@Service
public class OrderDetailService implements BaseService<OrderDetail, OrderDetailExample>{
	@Autowired
	private OrderDetailMapper orderDetailMapper;
	
      	   	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<OrderDetail> list(Tablepar tablepar, Long orderId){
	        OrderDetailExample testExample=new OrderDetailExample();
	        testExample.setOrderByClause("id ASC");
	        if(orderId!=null&&!"".equals(orderId)){
	        	testExample.createCriteria().andOrderIdEqualTo(orderId);
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<OrderDetail> list= orderDetailMapper.selectByExample(testExample);
	        PageInfo<OrderDetail> pageInfo = new PageInfo<OrderDetail>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(ids.split(","));
			List<Long> stringB = Arrays.asList(integers);
			OrderDetailExample example=new OrderDetailExample();
			example.createCriteria().andIdIn(stringB);
			return orderDetailMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public OrderDetail selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return orderDetailMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(OrderDetail record) {
		return orderDetailMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(OrderDetail record) {
				
		record.setId(null);
		
				
		return orderDetailMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(OrderDetail record, OrderDetailExample example) {
		
		return orderDetailMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(OrderDetail record, OrderDetailExample example) {
		
		return orderDetailMapper.updateByExample(record, example);
	}

	@Override
	public List<OrderDetail> selectByExample(OrderDetailExample example) {
		
		return orderDetailMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(OrderDetailExample example) {
		
		return orderDetailMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(OrderDetailExample example) {
		
		return orderDetailMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param orderDetail
	 * @return
	 */
	public int checkNameUnique(OrderDetail orderDetail){
		OrderDetailExample example=new OrderDetailExample();
		example.createCriteria().andOrderIdEqualTo(orderDetail.getOrderId());
		List<OrderDetail> list=orderDetailMapper.selectByExample(example);
		return list.size();
	}


}
