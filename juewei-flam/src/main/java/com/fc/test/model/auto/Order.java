package com.fc.test.model.auto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *  Order 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:03
 */
 @ApiModel(value="Order", description="")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 金额 **/
	@ApiModelProperty(value = "金额")
	private BigDecimal amount;
		
	/** 微信ID **/
	@ApiModelProperty(value = "微信ID")
	private String wechatId;
		
	/** 平台订单号 **/
	@ApiModelProperty(value = "平台订单号")
	private String orderNo;
		
	/** 微信订单号 **/
	@ApiModelProperty(value = "微信订单号")
	private String wechatOrderNo;
		
	/** 订单状态 **/
	@ApiModelProperty(value = "订单状态")
	private Integer oStatus;
		
	/** 微信名称 **/
	@ApiModelProperty(value = "微信名称")
	private String wechatName;
		
	/** 下单时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "下单时间")
	private Date placeOrderTm;
		
	/** 预计送达时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "预计送达时间")
	private Date expectSTm;
		
	/** 送达时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "送达时间")
	private Date sTm;
		
	/** 结束时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "结束时间")
	private Date overTm;
		
	/** 送达状态 **/
	@ApiModelProperty(value = "送达状态")
	private Integer tmFlag;
		
	/** 备注 **/
	@ApiModelProperty(value = "备注")
	private String remarks;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date cTm;
		
	/** 修改时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "修改时间")
	private Date uTm;

	private List<OrderDetail> orderDetails;

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
	 
			
	public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }
	 
			
	public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
	 
			
	public String getWechatOrderNo() {
        return wechatOrderNo;
    }

    public void setWechatOrderNo(String wechatOrderNo) {
        this.wechatOrderNo = wechatOrderNo;
    }
	 
			
	public Integer getoStatus() {
        return oStatus;
    }

    public void setoStatus(Integer oStatus) {
        this.oStatus = oStatus;
    }
	 
			
	public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName;
    }
	 
			
	public Date getPlaceOrderTm() {
        return placeOrderTm;
    }

    public void setPlaceOrderTm(Date placeOrderTm) {
        this.placeOrderTm = placeOrderTm;
    }
	 
			
	public Date getExpectsTm() {
        return expectSTm;
    }

    public void setExpectsTm(Date expectSTm) {
        this.expectSTm = expectSTm;
    }
	 
			
	public Date getsTm() {
        return sTm;
    }

    public void setsTm(Date sTm) {
        this.sTm = sTm;
    }
	 
			
	public Date getOverTm() {
        return overTm;
    }

    public void setOverTm(Date overTm) {
        this.overTm = overTm;
    }
	 
			
	public Integer getTmFlag() {
        return tmFlag;
    }

    public void setTmFlag(Integer tmFlag) {
        this.tmFlag = tmFlag;
    }
	 
			
	public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
	 
			
	public Order() {
        super();
    }
    
																																																																													
	public Order(Long id,BigDecimal amount,String wechatId,String orderNo,String wechatOrderNo,Integer oStatus,String wechatName,Date placeOrderTm,Date expectSTm,Date sTm,Date overTm,Integer tmFlag,String remarks,Date cTm,Date uTm) {
	
		this.id = id;
		this.amount = amount;
		this.wechatId = wechatId;
		this.orderNo = orderNo;
		this.wechatOrderNo = wechatOrderNo;
		this.oStatus = oStatus;
		this.wechatName = wechatName;
		this.placeOrderTm = placeOrderTm;
		this.expectSTm = expectSTm;
		this.sTm = sTm;
		this.overTm = overTm;
		this.tmFlag = tmFlag;
		this.remarks = remarks;
		this.cTm = cTm;
		this.uTm = uTm;
		
	}
	
}