package com.fc.test.mapper.auto;

import com.fc.test.model.auto.Order;
import com.fc.test.model.auto.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  OrderMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:03
 */
public interface OrderMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);
		
    Order selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example); 
		
    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
  	  	
}