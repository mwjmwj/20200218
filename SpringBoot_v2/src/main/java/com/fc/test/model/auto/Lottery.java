package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 彩票 Lottery 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-21 10:44:42
 */
 @ApiModel(value="Lottery", description="彩票")
public class Lottery implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 期 **/
	@ApiModelProperty(value = "期")
	private String period;
		
	/** 结束标记 **/
	@ApiModelProperty(value = "结束标记")
	private String endFlag;
		
	/** 五行 **/
	@ApiModelProperty(value = "五行")
	private String wuxing;
		
	/** 特码颜色 **/
	@ApiModelProperty(value = "特码颜色")
	private String sColor;
		
	/** 家野 **/
	@ApiModelProperty(value = "家野")
	private String jiaye;
		
	/** 性别 **/
	@ApiModelProperty(value = "性别")
	private String sex;
		
	/** 特码头数 **/
	@ApiModelProperty(value = "特码头数")
	private String sHead;
		
	/** 单双 **/
	@ApiModelProperty(value = "单双")
	private String sDanShuang;
		
	/** 尾数 **/
	@ApiModelProperty(value = "尾数")
	private String sTail;
		
	/** 数字和 **/
	@ApiModelProperty(value = "数字和")
	private String sHe;
		
	/** 所有数和 **/
	@ApiModelProperty(value = "所有数和")
	private String allSum;
		
	/** 开始时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "开始时间")
	private Date beginTm;
		
	/** 结束时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "结束时间")
	private Date endTm;
		
		
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
	 
			
	public String getEndFlag() {
        return endFlag;
    }

    public void setEndFlag(String endFlag) {
        this.endFlag = endFlag;
    }
	 
			
	public String getWuxing() {
        return wuxing;
    }

    public void setWuxing(String wuxing) {
        this.wuxing = wuxing;
    }
	 
			
	public String getsColor() {
        return sColor;
    }

    public void setsColor(String sColor) {
        this.sColor = sColor;
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
	 
			
	public String getsHead() {
        return sHead;
    }

    public void setsHead(String sHead) {
        this.sHead = sHead;
    }
	 
			
	public String getsDanShuang() {
        return sDanShuang;
    }

    public void setsDanShuang(String sDanShuang) {
        this.sDanShuang = sDanShuang;
    }
	 
			
	public String getsTail() {
        return sTail;
    }

    public void setsTail(String sTail) {
        this.sTail = sTail;
    }
	 
			
	public String getsHe() {
        return sHe;
    }

    public void setsHe(String sHe) {
        this.sHe = sHe;
    }
	 
			
	public String getAllSum() {
        return allSum;
    }

    public void setAllSum(String allSum) {
        this.allSum = allSum;
    }
	 
			
	public Date getBeginTm() {
        return beginTm;
    }

    public void setBeginTm(Date beginTm) {
        this.beginTm = beginTm;
    }
	 
			
	public Date getEndTm() {
        return endTm;
    }

    public void setEndTm(Date endTm) {
        this.endTm = endTm;
    }
	 
			
	public Lottery() {
        super();
    }
    
																																																																								
	public Lottery(Long id,String period,String endFlag,String wuxing,String sColor,String jiaye,String sex,String sHead,String sDanShuang,String sTail,String sHe,String allSum,Date beginTm,Date endTm) {
	
		this.id = id;
		this.period = period;
		this.endFlag = endFlag;
		this.wuxing = wuxing;
		this.sColor = sColor;
		this.jiaye = jiaye;
		this.sex = sex;
		this.sHead = sHead;
		this.sDanShuang = sDanShuang;
		this.sTail = sTail;
		this.sHe = sHe;
		this.allSum = allSum;
		this.beginTm = beginTm;
		this.endTm = endTm;
		
	}
	
}