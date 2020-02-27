package com.fc.test.mapper.auto;

import com.fc.test.model.auto.MerchantMill;
import com.fc.test.model.auto.MerchantMillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  MerchantMillMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:38
 */
public interface MerchantMillMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(MerchantMillExample example);

    int deleteByExample(MerchantMillExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(MerchantMill record);

    int insertSelective(MerchantMill record);

    List<MerchantMill> selectByExample(MerchantMillExample example);
		
    MerchantMill selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") MerchantMill record, @Param("example") MerchantMillExample example);

    int updateByExample(@Param("record") MerchantMill record, @Param("example") MerchantMillExample example); 
		
    int updateByPrimaryKeySelective(MerchantMill record);

    int updateByPrimaryKey(MerchantMill record);
  	  	
}