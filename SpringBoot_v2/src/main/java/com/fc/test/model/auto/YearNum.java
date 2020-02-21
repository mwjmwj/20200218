package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;
import java.lang.Integer;

/**
 * 年份数字 YearNum 
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:24:10
 */
 @ApiModel(value="YearNum", description="年份数字")
public class YearNum implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 年份 **/
	@ApiModelProperty(value = "年份")
	private String year;
		
	/** 数字 **/
	@ApiModelProperty(value = "数字")
	private Integer num;
		
		
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
	 
			
	public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
	 
			
	public YearNum() {
        super();
    }
    
																	
	public YearNum(Long id,String year,Integer num) {
	
		this.id = id;
		this.year = year;
		this.num = num;
		
	}
	
}