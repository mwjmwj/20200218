package com.fc.test.mapper.auto;

import com.fc.test.model.auto.Lottery;
import com.fc.test.model.auto.LotteryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 彩票 LotteryMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-21 10:44:42
 */
public interface LotteryMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(LotteryExample example);

    int deleteByExample(LotteryExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(Lottery record);

    int insertSelective(Lottery record);

    List<Lottery> selectByExample(LotteryExample example);
		
    Lottery selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") Lottery record, @Param("example") LotteryExample example);

    int updateByExample(@Param("record") Lottery record, @Param("example") LotteryExample example); 
		
    int updateByPrimaryKeySelective(Lottery record);

    int updateByPrimaryKey(Lottery record);
  	  	
}