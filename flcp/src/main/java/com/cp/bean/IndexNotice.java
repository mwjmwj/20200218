package com.cp.bean;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;

/**
 * 首页公告表 IndexNotice 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-21 16:04:10
 */
 @ApiModel(value="IndexNotice", description="首页公告表")
public class IndexNotice implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键ID **/
	@ApiModelProperty(value = "主键ID")
	private Long id;
		
	/** 公司公告 **/
	@ApiModelProperty(value = "公司公告")
	private String companyNotice;
		
	/** 联系方式 **/
	@ApiModelProperty(value = "联系方式")
	private String contactInfo;
		
	/** 预测图库 **/
	@ApiModelProperty(value = "预测图库")
	private String picUrl;
		
	/** 网站说明 **/
	@ApiModelProperty(value = "网站说明")
	private String webDesc;
		
	/** 彩票简介 **/
	@ApiModelProperty(value = "彩票简介")
	private String cpInfo;
		
		
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public String getCompanyNotice() {
        return companyNotice;
    }

    public void setCompanyNotice(String companyNotice) {
        this.companyNotice = companyNotice;
    }
	 
			
	public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
	 
			
	public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
	 
			
	public String getWebDesc() {
        return webDesc;
    }

    public void setWebDesc(String webDesc) {
        this.webDesc = webDesc;
    }
	 
			
	public String getCpInfo() {
        return cpInfo;
    }

    public void setCpInfo(String cpInfo) {
        this.cpInfo = cpInfo;
    }
	 
			
	public IndexNotice() {
        super();
    }
    
																																
	public IndexNotice(Long id,String companyNotice,String contactInfo,String picUrl,String webDesc,String cpInfo) {
	
		this.id = id;
		this.companyNotice = companyNotice;
		this.contactInfo = contactInfo;
		this.picUrl = picUrl;
		this.webDesc = webDesc;
		this.cpInfo = cpInfo;
		
	}
	
}