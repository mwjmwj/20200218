package com.fc.test.mapper.auto;

import com.fc.test.model.auto.OrderDetail;
import com.fc.test.model.auto.OrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  OrderDetailMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:52:50
 */
public interface OrderDetailMapper {
      	   	      	      	      	      	      	      	      	      
    long countByExample(OrderDetailExample example);

    int deleteByExample(OrderDetailExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    List<OrderDetail> selectByExample(OrderDetailExample example);
		
    OrderDetail selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    int updateByExample(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example); 
		
    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
  	  	
}