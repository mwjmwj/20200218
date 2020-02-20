package com.cp.util.result;

public class SystemCode {
	/**
	 * 标准失败，此失败无任何意思
	 */
	public static final String STANDARDERROR="1";
	public static final String STANDARDERROR_zh="失败";
	/**
	 * 成功，成功的唯一编码
	 */
	public static final String SUCCESS="0";
	public static final String SUCCESS_zh="成功";
	/**
	 * 除了SearchException、SearchError类的错误剩下的所有错误都时该值
	 */
	public static final String ERROR_JDK_ERROR="300000";
	/**
	 * SearchError类错误code从100000-199999
	 */
	public static final String ERROR_SEARCH_ERROR = "100000";
	/**
	 * SearchException类错误code从200000-299999
	 */
	public static final String ERROR_SEARCH_EXCEPTION = "200000";
	/**
	 * 从数据库加载数据为空错误
	 */
	public static final String ERROR_DATA_NULL_ERROR="200001";
}
