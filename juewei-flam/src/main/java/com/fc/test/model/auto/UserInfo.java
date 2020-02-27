package com.fc.test.model.auto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 *  UserInfo 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:57:54
 */
 @ApiModel(value="UserInfo", description="")
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 名称 **/
	@ApiModelProperty(value = "名称")
	private String name;
		
	/** 手机 **/
	@ApiModelProperty(value = "手机")
	private String mobile;
		
	/** 微信Id **/
	@ApiModelProperty(value = "微信Id")
	private String wechatId;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date cTm;
		
	/** 修改时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "修改时间")
	private Date uTm;
	private String avatar;

	public int getGender() {
		return gender;
	}

	private int gender;


	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	 
			
	public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
	 
			
	public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }
	 
			
	public Date getcTm() {
        return cTm;
    }

    public void setcTm(Date cTm) {
        this.cTm = cTm;
    }
	 
			
	public Date getuTm() {
        return uTm;
    }

    public void setuTm(Date uTm) {
        this.uTm = uTm;
    }
	 
			
	public UserInfo() {
        super();
    }
    
																																
	public UserInfo(Long id,String name,String mobile,String wechatId,Date cTm,Date uTm) {
	
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.wechatId = wechatId;
		this.cTm = cTm;
		this.uTm = uTm;
		
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
}