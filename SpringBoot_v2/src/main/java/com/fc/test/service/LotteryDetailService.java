package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.LotteryDetailMapper;
import com.fc.test.model.auto.LotteryDetail;
import com.fc.test.model.auto.LotteryDetailExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 * 彩票详情 LotteryDetailService
 * @Title: LotteryDetailService.java 
 * @Package com.fc.test.service 
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:22:25  
 **/
@Service
public class LotteryDetailService implements BaseService<LotteryDetail, LotteryDetailExample>{
	@Autowired
	private LotteryDetailMapper lotteryDetailMapper;
	
      	   	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<LotteryDetail> list(Tablepar tablepar,String name){
	        LotteryDetailExample testExample=new LotteryDetailExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andTlIdLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<LotteryDetail> list= lotteryDetailMapper.selectByExample(testExample);
	        PageInfo<LotteryDetail> pageInfo = new PageInfo<LotteryDetail>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			LotteryDetailExample example=new LotteryDetailExample();
			example.createCriteria().andIdIn(stringB);
			return lotteryDetailMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public LotteryDetail selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return lotteryDetailMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(LotteryDetail record) {
		return lotteryDetailMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(LotteryDetail record) {
				
		record.setId(null);
		
				
		return lotteryDetailMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(LotteryDetail record, LotteryDetailExample example) {
		
		return lotteryDetailMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(LotteryDetail record, LotteryDetailExample example) {
		
		return lotteryDetailMapper.updateByExample(record, example);
	}

	@Override
	public List<LotteryDetail> selectByExample(LotteryDetailExample example) {
		
		return lotteryDetailMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(LotteryDetailExample example) {
		
		return lotteryDetailMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(LotteryDetailExample example) {
		
		return lotteryDetailMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param lotteryDetail
	 * @return
	 */
	public int checkNameUnique(LotteryDetail lotteryDetail){
		LotteryDetailExample example=new LotteryDetailExample();
		example.createCriteria().andTlIdEqualTo(lotteryDetail.getTlId());
		List<LotteryDetail> list=lotteryDetailMapper.selectByExample(example);
		return list.size();
	}


}
