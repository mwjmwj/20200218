package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  OrderDetail 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:52:50
 */
 @ApiModel(value="OrderDetail", description="")
public class OrderDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 订单ID **/
	@ApiModelProperty(value = "订单ID")
	private Long orderId;
		
	/** 名称 **/
	@ApiModelProperty(value = "名称")
	private String name;
		
	/** 数量 **/
	@ApiModelProperty(value = "数量")
	private Integer num;
		
	/** 价格 **/
	@ApiModelProperty(value = "价格")
	private BigDecimal price;
		
	/** 折扣 **/
	@ApiModelProperty(value = "折扣")
	private BigDecimal sale;
		
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
	 
			
	public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
	 
			
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	 
			
	public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
	 
			
	public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
	 
			
	public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
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
	 
			
	public OrderDetail() {
        super();
    }
    
																																										
	public OrderDetail(Long id,Long orderId,String name,Integer num,BigDecimal price,BigDecimal sale,Date cTm,Date uTm) {
	
		this.id = id;
		this.orderId = orderId;
		this.name = name;
		this.num = num;
		this.price = price;
		this.sale = sale;
		this.cTm = cTm;
		this.uTm = uTm;
		
	}
	
}