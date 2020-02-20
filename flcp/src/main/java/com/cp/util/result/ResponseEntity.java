package com.cp.util.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * 接口统一返回格式
 * @author 2019271
 *
 * @param <T>
 */
@ApiModel(description = "标准返回模板")
public class ResponseEntity<T>{
    /**
     * 是否成功,true成功
     */
    @ApiModelProperty(value = "是否成功,true成功")
    private boolean success=true;

    /**
     * 结果信息编号，非0为错误，0为正常执行，success为0则成功
     */
	@ApiModelProperty(value = "结果状态,0正常，非0错误")
    private String code="0";

    /**
     * 返回的消息
     */
	@ApiModelProperty(value = "返回的消息")
    private final List<String> msgs  = new ArrayList<String>();

    /**
     * 返回值，类型为T
     */
	@ApiModelProperty(value = "返回内容")
    private T data;

	@ApiModelProperty(value = "分页信息")
    private PageInfo pageInfo;

    public ResponseEntity(){}

    public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		if(code==null||"".equals(code.trim())){
			throw new RuntimeException("返回对象中的系统状态码不能为空");
		}
		for (int i = 0; i < code.length(); i++) {
			char ch = code.charAt(i);
			if (!Character.isDigit(ch)) {
				throw new RuntimeException("返回对象中的系统状态码字符只能由数字组成");
			}
		}
		this.code = code;
	}

	public List<String> getMsgs() {
		return msgs;
	}

	public void setMsgs(List<String> msgs) {
		if(msgs==null||msgs.size()<=0){
			return;
		}
		for(String msg:msgs){
			this.setMsgForOne(msg);
		}
	}

	public void setMsgsForArray(String ...msgs) {
		if(msgs==null||msgs.length<=0){
			return;
		}
		for(String msg:msgs){
			this.setMsgForOne(msg);
		}
	}

	public void setMsgForOne(String msg){
		if(msg==null||"".equals(msg.trim())){
			return;
		}
		this.msgs.add(msg.trim());
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		if(data==null){
			return;
		}
		this.data = data;
	}

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
}

