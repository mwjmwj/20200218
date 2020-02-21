package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.LotteryMapper;
import com.fc.test.model.auto.Lottery;
import com.fc.test.model.auto.LotteryExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 * 彩票 LotteryService
 * @Title: LotteryService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-21 10:44:42  
 **/
@Service
public class LotteryService implements BaseService<Lottery, LotteryExample>{
	@Autowired
	private LotteryMapper lotteryMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Lottery> list(Tablepar tablepar,String name){
	        LotteryExample testExample=new LotteryExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andPeriodLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<Lottery> list= lotteryMapper.selectByExample(testExample);
	        PageInfo<Lottery> pageInfo = new PageInfo<Lottery>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			LotteryExample example=new LotteryExample();
			example.createCriteria().andIdIn(stringB);
			return lotteryMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public Lottery selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return lotteryMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(Lottery record) {
		return lotteryMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Lottery record) {
				
		record.setId(null);
		
				
		return lotteryMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Lottery record, LotteryExample example) {
		
		return lotteryMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Lottery record, LotteryExample example) {
		
		return lotteryMapper.updateByExample(record, example);
	}

	@Override
	public List<Lottery> selectByExample(LotteryExample example) {
		
		return lotteryMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(LotteryExample example) {
		
		return lotteryMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(LotteryExample example) {
		
		return lotteryMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param lottery
	 * @return
	 */
	public int checkNameUnique(Lottery lottery){
		LotteryExample example=new LotteryExample();
		example.createCriteria().andPeriodEqualTo(lottery.getPeriod());
		List<Lottery> list=lotteryMapper.selectByExample(example);
		return list.size();
	}


}
