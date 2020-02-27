package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *  GoodsPrice 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:57:11
 */
 @ApiModel(value="GoodsPrice", description="")
public class GoodsPrice implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 商品ID **/
	@ApiModelProperty(value = "商品ID")
	private Long goodsId;
		
	/** 价格 **/
	@ApiModelProperty(value = "价格")
	private BigDecimal price;
		
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
	 
			
	public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
	 
			
	public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
	 
			
	public GoodsPrice() {
        super();
    }
    
																											
	public GoodsPrice(Long id,Long goodsId,BigDecimal price,Date cTm,Date uTm) {
	
		this.id = id;
		this.goodsId = goodsId;
		this.price = price;
		this.cTm = cTm;
		this.uTm = uTm;
		
	}
	
}