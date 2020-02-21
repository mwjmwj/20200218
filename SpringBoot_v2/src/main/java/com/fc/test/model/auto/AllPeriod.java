package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;

/**
 *  AllPeriod 
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:23:00
 */
 @ApiModel(value="AllPeriod", description="")
public class AllPeriod implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/**  **/
	@ApiModelProperty(value = "")
	private String yangTm;
		
	/**  **/
	@ApiModelProperty(value = "")
	private String yinTm;
		
	/**  **/
	@ApiModelProperty(value = "")
	private String period;
		
	/**  **/
	@ApiModelProperty(value = "")
	private String year;
		
		
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public String getYangTm() {
        return yangTm;
    }

    public void setYangTm(String yangTm) {
        this.yangTm = yangTm;
    }
	 
			
	public String getYinTm() {
        return yinTm;
    }

    public void setYinTm(String yinTm) {
        this.yinTm = yinTm;
    }
	 
			
	public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
	 
			
	public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
	 
			
	public AllPeriod() {
        super();
    }
    
																											
	public AllPeriod(Long id,String yangTm,String yinTm,String period,String year) {
	
		this.id = id;
		this.yangTm = yangTm;
		this.yinTm = yinTm;
		this.period = period;
		this.year = year;
		
	}
	
}