package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *  Apprise 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:21
 */
 @ApiModel(value="Apprise", description="")
public class Apprise implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 订单ID **/
	@ApiModelProperty(value = "订单ID")
	private Long orderId;
		
	/** 订单详情ID **/
	@ApiModelProperty(value = "订单详情ID")
	private Long orderDetailId;
		
	/** 内容 **/
	@ApiModelProperty(value = "内容")
	private String content;
		
	/** 星级 **/
	@ApiModelProperty(value = "星级")
	private String star;
		
	/** 用户名称 **/
	@ApiModelProperty(value = "用户名称")
	private String wechatName;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date cTm;
		
	/** 修改时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "修改时间")
	private Date eTm;
		
		
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
	 
			
	public Long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }
	 
			
	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
	 
			
	public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }
	 
			
	public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName;
    }
	 
			
	public Date getcTm() {
        return cTm;
    }

    public void setcTm(Date cTm) {
        this.cTm = cTm;
    }
	 
			
	public Date geteTm() {
        return eTm;
    }

    public void seteTm(Date eTm) {
        this.eTm = eTm;
    }
	 
			
	public Apprise() {
        super();
    }
    
																																										
	public Apprise(Long id,Long orderId,Long orderDetailId,String content,String star,String wechatName,Date cTm,Date eTm) {
	
		this.id = id;
		this.orderId = orderId;
		this.orderDetailId = orderDetailId;
		this.content = content;
		this.star = star;
		this.wechatName = wechatName;
		this.cTm = cTm;
		this.eTm = eTm;
		
	}
	
}