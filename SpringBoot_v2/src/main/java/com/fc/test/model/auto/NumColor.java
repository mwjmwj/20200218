package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;

/**
 *  NumColor 
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:23:57
 */
 @ApiModel(value="NumColor", description="")
public class NumColor implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/**  **/
	@ApiModelProperty(value = "")
	private String num;
		
	/**  **/
	@ApiModelProperty(value = "")
	private String color;
		
	/**  **/
	@ApiModelProperty(value = "")
	private String colorDesc;
		
	/**  **/
	@ApiModelProperty(value = "")
	private String wuxing;
		
		
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
	 
			
	public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
	 
			
	public String getColorDesc() {
        return colorDesc;
    }

    public void setColorDesc(String colorDesc) {
        this.colorDesc = colorDesc;
    }
	 
			
	public String getWuxing() {
        return wuxing;
    }

    public void setWuxing(String wuxing) {
        this.wuxing = wuxing;
    }
	 
			
	public NumColor() {
        super();
    }
    
																											
	public NumColor(Long id,String num,String color,String colorDesc,String wuxing) {
	
		this.id = id;
		this.num = num;
		this.color = color;
		this.colorDesc = colorDesc;
		this.wuxing = wuxing;
		
	}
	
}