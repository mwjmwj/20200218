package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 彩票详情 LotteryDetail 
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:22:25
 */
 @ApiModel(value="LotteryDetail", description="彩票详情")
public class LotteryDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 彩票主ID **/
	@ApiModelProperty(value = "彩票主ID")
	private Long tlId;
		
	/** 数字 **/
	@ApiModelProperty(value = "数字")
	private String num;
		
	/** 排序 **/
	@ApiModelProperty(value = "排序")
	private String order;
		
	/** 是否为特 **/
	@ApiModelProperty(value = "是否为特")
	private String codeType;
		
	/** 颜色 **/
	@ApiModelProperty(value = "颜色")
	private String color;
		
	/** 动物 **/
	@ApiModelProperty(value = "动物")
	private String animal;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date createTm;
		
		
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public Long getTlId() {
        return tlId;
    }

    public void setTlId(Long tlId) {
        this.tlId = tlId;
    }
	 
			
	public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
	 
			
	public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
	 
			
	public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }
	 
			
	public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
	 
			
	public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
	 
			
	public Date getCreateTm() {
        return createTm;
    }

    public void setCreateTm(Date createTm) {
        this.createTm = createTm;
    }
	 
			
	public LotteryDetail() {
        super();
    }
    
																																										
	public LotteryDetail(Long id,Long tlId,String num,String order,String codeType,String color,String animal,Date createTm) {
	
		this.id = id;
		this.tlId = tlId;
		this.num = num;
		this.order = order;
		this.codeType = codeType;
		this.color = color;
		this.animal = animal;
		this.createTm = createTm;
		
	}
	
}