package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  GoodsDetail 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:57:26
 */
 @ApiModel(value="GoodsDetail", description="")
public class GoodsDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 名称 **/
	@ApiModelProperty(value = "名称")
	private String nameDesc;
		
	/** 详情 **/
	@ApiModelProperty(value = "详情")
	private String detail;
		
	/** 图片 **/
	@ApiModelProperty(value = "图片")
	private String picImg;
		
	/** 热销 **/
	@ApiModelProperty(value = "热销")
	private Integer hotFlag;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date cTm;
		
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
	 
			
	public String getNameDesc() {
        return nameDesc;
    }

    public void setNameDesc(String nameDesc) {
        this.nameDesc = nameDesc;
    }
	 
			
	public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
	 
			
	public String getPicImg() {
        return picImg;
    }

    public void setPicImg(String picImg) {
        this.picImg = picImg;
    }
	 
			
	public Integer getHotFlag() {
        return hotFlag;
    }

    public void setHotFlag(Integer hotFlag) {
        this.hotFlag = hotFlag;
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
	 
			
	public GoodsDetail() {
        super();
    }
    
																																					
	public GoodsDetail(Long id,String nameDesc,String detail,String picImg,Integer hotFlag,Date cTm,Date uTm) {
	
		this.id = id;
		this.nameDesc = nameDesc;
		this.detail = detail;
		this.picImg = picImg;
		this.hotFlag = hotFlag;
		this.cTm = cTm;
		this.uTm = uTm;
		
	}
	
}