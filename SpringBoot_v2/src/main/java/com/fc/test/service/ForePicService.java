package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.ForePicMapper;
import com.fc.test.model.auto.ForePic;
import com.fc.test.model.auto.ForePicExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 * 图库表 ForePicService
 * @Title: ForePicService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-22 11:54:23  
 **/
@Service
public class ForePicService implements BaseService<ForePic, ForePicExample>{
	@Autowired
	private ForePicMapper forePicMapper;
	
      	   	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ForePic> list(Tablepar tablepar,String name){
	        ForePicExample testExample=new ForePicExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andNameLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ForePic> list= forePicMapper.selectByExample(testExample);
	        PageInfo<ForePic> pageInfo = new PageInfo<ForePic>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			ForePicExample example=new ForePicExample();
			example.createCriteria().andIdIn(stringB);
			return forePicMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public ForePic selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return forePicMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(ForePic record) {
		return forePicMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ForePic record) {
				
		record.setId(null);
		
				
		return forePicMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(ForePic record, ForePicExample example) {
		
		return forePicMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ForePic record, ForePicExample example) {
		
		return forePicMapper.updateByExample(record, example);
	}

	@Override
	public List<ForePic> selectByExample(ForePicExample example) {
		
		return forePicMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ForePicExample example) {
		
		return forePicMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ForePicExample example) {
		
		return forePicMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param forePic
	 * @return
	 */
	public int checkNameUnique(ForePic forePic){
		ForePicExample example=new ForePicExample();
		example.createCriteria().andNameEqualTo(forePic.getName());
		List<ForePic> list=forePicMapper.selectByExample(example);
		return list.size();
	}


}
