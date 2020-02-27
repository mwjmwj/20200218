package com.fc.test.service;

import cn.hutool.core.convert.Convert;
import com.fc.test.mapper.auto.UserInfoMapper;
import com.fc.test.model.auto.UserInfo;
import com.fc.test.model.auto.UserInfoExample;
import com.fc.test.util.Tablepar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 *  UserInfoService
 * @Title: UserInfoService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:57:54  
 **/
@Service
public class UserInfoService implements BaseService<UserInfo, UserInfoExample>{
	@Autowired
	private UserInfoMapper userInfoMapper;
	
      	   	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<UserInfo> list(Tablepar tablepar, String name){
	        UserInfoExample testExample=new UserInfoExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andNameLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<UserInfo> list= userInfoMapper.selectByExample(testExample);
	        PageInfo<UserInfo> pageInfo = new PageInfo<UserInfo>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(ids.split(","));
			List<Long> stringB = Arrays.asList(integers);
			UserInfoExample example=new UserInfoExample();
			example.createCriteria().andIdIn(stringB);
			return userInfoMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public UserInfo selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return userInfoMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(UserInfo record) {
		return userInfoMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(UserInfo record) {
				
		record.setId(null);
		
				
		return userInfoMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(UserInfo record, UserInfoExample example) {
		
		return userInfoMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(UserInfo record, UserInfoExample example) {
		
		return userInfoMapper.updateByExample(record, example);
	}

	@Override
	public List<UserInfo> selectByExample(UserInfoExample example) {
		
		return userInfoMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(UserInfoExample example) {
		
		return userInfoMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(UserInfoExample example) {
		
		return userInfoMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param userInfo
	 * @return
	 */
	public int checkNameUnique(UserInfo userInfo){
		UserInfoExample example=new UserInfoExample();
		example.createCriteria().andNameEqualTo(userInfo.getName());
		List<UserInfo> list=userInfoMapper.selectByExample(example);
		return list.size();
	}


	public UserInfo queryByOpenId(String openid) {

		return userInfoMapper.queryByOpenId(openid);
	}
}
