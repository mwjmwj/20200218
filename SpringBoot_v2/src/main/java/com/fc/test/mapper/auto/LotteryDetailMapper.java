package com.fc.test.mapper.auto;

import com.fc.test.model.auto.LotteryDetail;
import com.fc.test.model.auto.LotteryDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 彩票详情 LotteryDetailMapper
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:22:25
 */
public interface LotteryDetailMapper {
      	   	      	      	      	      	      	      	      	      
    long countByExample(LotteryDetailExample example);

    int deleteByExample(LotteryDetailExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(LotteryDetail record);

    int insertSelective(LotteryDetail record);

    List<LotteryDetail> selectByExample(LotteryDetailExample example);
		
    LotteryDetail selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") LotteryDetail record, @Param("example") LotteryDetailExample example);

    int updateByExample(@Param("record") LotteryDetail record, @Param("example") LotteryDetailExample example); 
		
    int updateByPrimaryKeySelective(LotteryDetail record);

    int updateByPrimaryKey(LotteryDetail record);
  	  	
}