package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 * 测试表 Test 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-21 10:04:45
 */
 @ApiModel(value="Test", description="测试表")
public class Test implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 主键 **/
	@ApiModelProperty(value = "主键")
	private String id;
		
	/** 名称 **/
	@ApiModelProperty(value = "名称")
	private String name;
		
	/** 性别 **/
	@ApiModelProperty(value = "性别")
	private Integer age;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date cratetime;
		
		
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
	 
			
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	 
			
	public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
	 
			
	public Date getCratetime() {
        return cratetime;
    }

    public void setCratetime(Date cratetime) {
        this.cratetime = cratetime;
    }
	 
			
	public Test() {
        super();
    }
    
																						
	public Test(String id,String name,Integer age,Date cratetime) {
	
		this.id = id;
		this.name = name;
		this.age = age;
		this.cratetime = cratetime;
		
	}
	
}