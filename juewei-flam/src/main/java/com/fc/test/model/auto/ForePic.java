package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;

/**
 * 图库表 ForePic 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-22 11:54:23
 */
 @ApiModel(value="ForePic", description="图库表")
public class ForePic implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 名称 **/
	@ApiModelProperty(value = "名称")
	private String name;
		
	/** 路径 **/
	@ApiModelProperty(value = "路径")
	private String url;
		
	/** 后缀 **/
	@ApiModelProperty(value = "后缀")
	private String tail;
		
		
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	 
			
	public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
	 
			
	public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
	 
			
	public ForePic() {
        super();
    }
    
																						
	public ForePic(Long id,String name,String url,String tail) {
	
		this.id = id;
		this.name = name;
		this.url = url;
		this.tail = tail;
		
	}
	
}