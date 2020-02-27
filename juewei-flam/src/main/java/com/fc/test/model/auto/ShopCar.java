package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  ShopCar 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-25 10:52:19
 */
 @ApiModel(value="ShopCar", description="")
public class ShopCar implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 微信ID **/
	@ApiModelProperty(value = "微信ID")
	private String wechatId;
		
	/** 商品ID **/
	@ApiModelProperty(value = "商品ID")
	private Long goodsId;
		
	/** 数量 **/
	@ApiModelProperty(value = "数量")
	private Integer num;
		
	/** 状态 **/
	@ApiModelProperty(value = "状态")
	private Integer status;
		
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
	 
			
	public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }
	 
			
	public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
	 
			
	public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
	 
			
	public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
	 
			
	public ShopCar() {
        super();
    }
    
																																					
	public ShopCar(Long id,String wechatId,Long goodsId,Integer num,Integer status,Date cTm,Date uTm) {
	
		this.id = id;
		this.wechatId = wechatId;
		this.goodsId = goodsId;
		this.num = num;
		this.status = status;
		this.cTm = cTm;
		this.uTm = uTm;
		
	}
	
}