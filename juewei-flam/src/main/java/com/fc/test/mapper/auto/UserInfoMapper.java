package com.fc.test.mapper.auto;

import com.fc.test.model.auto.UserInfo;
import com.fc.test.model.auto.UserInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  UserInfoMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:57:54
 */
public interface UserInfoMapper {
      	   	      	      	      	      	      	      
    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);
		
    UserInfo selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example); 
		
    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    UserInfo queryByOpenId(String openid);
}