package com.cp.util.result;

/**
 * 用于快速构建ResponseEntity对象
 * @author 2019271
 *
 */
public class RSBuild {
	private  RSBuild(){}
	public static RSBuild ins(){
		RSBuild tmp = new RSBuild();
		return tmp;
	}
	/**
	 * 创建成功状态的返回对象
	 * @return
	 */
	public <T> ResponseEntity<T> success(){
		ResponseEntity<T> result = this.base(null, SystemCode.SUCCESS, true, SystemCode.SUCCESS_zh);
		return result;
	}
	/**
	 * 创建成功状态的返回对象，带消息
	 * @param msg
	 * @return
	 */
	public <T> ResponseEntity<T> successForMsgs(String ...msg){
		ResponseEntity<T> result = this.base(null, SystemCode.SUCCESS, true, msg);
		return result;
	}
	/**
	 * 创建成功状态的返回对象，带数据和消息
	 * @param data
	 * @param msg
	 * @return
	 */
	public <T> ResponseEntity<T> successForDataAndMsgs(T data ,String ...msg){
		ResponseEntity<T> result = this.base(data, SystemCode.SUCCESS, true, msg);
		return result;
	}

	/**
	 * 创建成功状态的返回对象，带数据
	 * @param data
	 * @param <T>
	 * @return
	 */
	public <T> ResponseEntity<T> successForData(T data){
		ResponseEntity<T> result = this.base(data, SystemCode.SUCCESS, true, "操作成功");
		return result;
	}
	/**
	 * 创建失败状态的返回对象
	 * @return
	 */
	public <T> ResponseEntity<T> fail(){
		ResponseEntity<T> result = this.base(null, SystemCode.STANDARDERROR, false, SystemCode.STANDARDERROR_zh);
		return result;
	}
	/**
	 * 创建失败状态的返回对象,带消息
	 * @param msgs
	 * @return
	 */
	public <T> ResponseEntity<T> failForMsgs(String ...msgs){
		ResponseEntity<T> result = this.base(null, SystemCode.STANDARDERROR, false, msgs);
		return result;
	}
	/**
	 * 创建失败状态的返回对象，带系统状态码
	 * @param code
	 * @return
	 */
	public <T> ResponseEntity<T> failForCode(String code){
		ResponseEntity<T> result = this.base(null, code, false, SystemCode.STANDARDERROR_zh);
		return result;
	}
	/**
	 * 创建失败状态的返回对象，带系统状态码和消息
	 * @param code
	 * @param msgs
	 * @return
	 */
	public <T> ResponseEntity<T> failForCodeAndMsgs(String code,String ...msgs){
		ResponseEntity<T> result = this.base(null, code, false, msgs);
		return result;
	}
	/**
	 * 创建返回对象，手动进行构建状态
	 * @param data
	 * @param code
	 * @param isSuccess
	 * @param msg
	 * @return
	 */
	public <T> ResponseEntity<T> base(T data ,String code,boolean isSuccess,String ...msg){
		ResponseEntity<T> result = new ResponseEntity<T>();
		result.setData(data);
		result.setCode(code);
		result.setMsgsForArray(msg);
		result.setSuccess(isSuccess);
		return result;
	}
}
