package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  GoodsQty 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:56:59
 */
 @ApiModel(value="GoodsQty", description="")
public class GoodsQty implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 商品ID **/
	@ApiModelProperty(value = "商品ID")
	private Long goodsId;
		
	/** 剩余货量 **/
	@ApiModelProperty(value = "剩余货量")
	private Integer qty;
		
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
	 
			
	public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
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
	 
			
	public GoodsQty() {
        super();
    }
    
																											
	public GoodsQty(Long id,Long goodsId,Integer qty,Date cTm,Date uTm) {
	
		this.id = id;
		this.goodsId = goodsId;
		this.qty = qty;
		this.cTm = cTm;
		this.uTm = uTm;
		
	}
	
}