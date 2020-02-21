package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 操控 DiyLottery 
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:13:15
 */
 @ApiModel(value="DiyLottery", description="操控")
public class DiyLottery implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 期 **/
	@ApiModelProperty(value = "期")
	private String period;
		
	/** 期号码 **/
	@ApiModelProperty(value = "期号码")
	private String code;
		
	/** 特码 **/
	@ApiModelProperty(value = "特码")
	private String sCode;
		
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
	 
			
	public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
	 
			
	public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
	 
			
	public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }
	 
			
	public Date getCreateTm() {
        return createTm;
    }

    public void setCreateTm(Date createTm) {
        this.createTm = createTm;
    }
	 
			
	public DiyLottery() {
        super();
    }
    
																											
	public DiyLottery(Long id,String period,String code,String sCode,Date createTm) {
	
		this.id = id;
		this.period = period;
		this.code = code;
		this.sCode = sCode;
		this.createTm = createTm;
		
	}
	
}