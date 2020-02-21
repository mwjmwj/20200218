package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.DiyLotteryMapper;
import com.fc.test.model.auto.DiyLottery;
import com.fc.test.model.auto.DiyLotteryExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 * 操控 DiyLotteryService
 * @Title: DiyLotteryService.java 
 * @Package com.fc.test.service 
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:13:15  
 **/
@Service
public class DiyLotteryService implements BaseService<DiyLottery, DiyLotteryExample>{
	@Autowired
	private DiyLotteryMapper diyLotteryMapper;
	
      	   	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<DiyLottery> list(Tablepar tablepar,String name){
	        DiyLotteryExample testExample=new DiyLotteryExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andPeriodLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<DiyLottery> list= diyLotteryMapper.selectByExample(testExample);
	        PageInfo<DiyLottery> pageInfo = new PageInfo<DiyLottery>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			DiyLotteryExample example=new DiyLotteryExample();
			example.createCriteria().andIdIn(stringB);
			return diyLotteryMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public DiyLottery selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return diyLotteryMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(DiyLottery record) {
		return diyLotteryMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(DiyLottery record) {
				
		record.setId(null);
		
				
		return diyLotteryMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(DiyLottery record, DiyLotteryExample example) {
		
		return diyLotteryMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(DiyLottery record, DiyLotteryExample example) {
		
		return diyLotteryMapper.updateByExample(record, example);
	}

	@Override
	public List<DiyLottery> selectByExample(DiyLotteryExample example) {
		
		return diyLotteryMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(DiyLotteryExample example) {
		
		return diyLotteryMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(DiyLotteryExample example) {
		
		return diyLotteryMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param diyLottery
	 * @return
	 */
	public int checkNameUnique(DiyLottery diyLottery){
		DiyLotteryExample example=new DiyLotteryExample();
		example.createCriteria().andPeriodEqualTo(diyLottery.getPeriod());
		List<DiyLottery> list=diyLotteryMapper.selectByExample(example);
		return list.size();
	}


}
