package com.fc.test.mapper.auto;

import com.fc.test.model.auto.DiyLottery;
import com.fc.test.model.auto.DiyLotteryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 操控 DiyLotteryMapper
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:13:15
 */
public interface DiyLotteryMapper {
      	   	      	      	      	      	      
    long countByExample(DiyLotteryExample example);

    int deleteByExample(DiyLotteryExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(DiyLottery record);

    int insertSelective(DiyLottery record);

    List<DiyLottery> selectByExample(DiyLotteryExample example);
		
    DiyLottery selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") DiyLottery record, @Param("example") DiyLotteryExample example);

    int updateByExample(@Param("record") DiyLottery record, @Param("example") DiyLotteryExample example); 
		
    int updateByPrimaryKeySelective(DiyLottery record);

    int updateByPrimaryKey(DiyLottery record);
  	  	
}