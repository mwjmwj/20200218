package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 动物 BaseAnimal 
 * @author xx_自动生成
 * @email xx@qq.com
 * @date 2020-02-21 12:22:40
 */
 @ApiModel(value="BaseAnimal", description="动物")
public class BaseAnimal implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 名称 **/
	@ApiModelProperty(value = "名称")
	private String name;
		
	/** 名称描述 **/
	@ApiModelProperty(value = "名称描述")
	private String nameDesc;
		
	/** 家野 **/
	@ApiModelProperty(value = "家野")
	private String jiaye;
		
	/** 性别 **/
	@ApiModelProperty(value = "性别")
	private String sex;
		
	/** 排序 **/
	@ApiModelProperty(value = "排序")
	private String order;
		
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
	 
			
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	 
			
	public String getNameDesc() {
        return nameDesc;
    }

    public void setNameDesc(String nameDesc) {
        this.nameDesc = nameDesc;
    }
	 
			
	public String getJiaye() {
        return jiaye;
    }

    public void setJiaye(String jiaye) {
        this.jiaye = jiaye;
    }
	 
			
	public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
	 
			
	public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
	 
			
	public Date getCreateTm() {
        return createTm;
    }

    public void setCreateTm(Date createTm) {
        this.createTm = createTm;
    }
	 
			
	public BaseAnimal() {
        super();
    }
    
																																					
	public BaseAnimal(Long id,String name,String nameDesc,String jiaye,String sex,String order,Date createTm) {
	
		this.id = id;
		this.name = name;
		this.nameDesc = nameDesc;
		this.jiaye = jiaye;
		this.sex = sex;
		this.order = order;
		this.createTm = createTm;
		
	}
	
}