package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *  MerchantMill 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:38
 */
 @ApiModel(value="MerchantMill", description="")
public class MerchantMill implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 名称 **/
	@ApiModelProperty(value = "名称")
	private String name;
		
	/** 类型 **/
	@ApiModelProperty(value = "类型")
	private String type;
		
	/** 备注 **/
	@ApiModelProperty(value = "备注")
	private String remark;
		
	/** 地址 **/
	@ApiModelProperty(value = "地址")
	private String address;
		
	/** 联系方式 **/
	@ApiModelProperty(value = "联系方式")
	private String telPhone;
		
	/** 营业执照图片 **/
	@ApiModelProperty(value = "营业执照图片")
	private String bisQuaPic;
		
	/** 备注图片 **/
	@ApiModelProperty(value = "备注图片")
	private String remarkPic;
		
	/** 背景图片 **/
	@ApiModelProperty(value = "背景图片")
	private String backPic;
		
	/** 头像图片 **/
	@ApiModelProperty(value = "头像图片")
	private String headPic;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date tTm;
		
	/** 修改时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "修改时间")
	private Date uTm;
		
		
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
	 
			
	public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
	 
			
	public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
	 
			
	public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
	 
			
	public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }
	 
			
	public String getBisQuaPic() {
        return bisQuaPic;
    }

    public void setBisQuaPic(String bisQuaPic) {
        this.bisQuaPic = bisQuaPic;
    }
	 
			
	public String getRemarkPic() {
        return remarkPic;
    }

    public void setRemarkPic(String remarkPic) {
        this.remarkPic = remarkPic;
    }
	 
			
	public String getBackPic() {
        return backPic;
    }

    public void setBackPic(String backPic) {
        this.backPic = backPic;
    }
	 
			
	public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }
	 
			
	public Date gettTm() {
        return tTm;
    }

    public void settTm(Date tTm) {
        this.tTm = tTm;
    }
	 
			
	public Date getuTm() {
        return uTm;
    }

    public void setuTm(Date uTm) {
        this.uTm = uTm;
    }
	 
			
	public MerchantMill() {
        super();
    }
    
																																																														
	public MerchantMill(Long id,String name,String type,String remark,String address,String telPhone,String bisQuaPic,String remarkPic,String backPic,String headPic,Date tTm,Date uTm) {
	
		this.id = id;
		this.name = name;
		this.type = type;
		this.remark = remark;
		this.address = address;
		this.telPhone = telPhone;
		this.bisQuaPic = bisQuaPic;
		this.remarkPic = remarkPic;
		this.backPic = backPic;
		this.headPic = headPic;
		this.tTm = tTm;
		this.uTm = uTm;
		
	}
	
}