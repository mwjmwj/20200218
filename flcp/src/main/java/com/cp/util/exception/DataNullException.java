package com.cp.util.exception;


import com.cp.util.result.SystemCode;

/**
 * 从数据库加载数据为空的错误异常
 */
public class DataNullException extends SearchException {
    public DataNullException() {
        super();
        super.setCode(SystemCode.ERROR_DATA_NULL_ERROR);
    }

    public DataNullException(String message) {
        super(message);
        super.setCode(SystemCode.ERROR_DATA_NULL_ERROR);
    }

    public DataNullException(String message, Throwable cause) {
        super(message, cause);
        super.setCode(SystemCode.ERROR_DATA_NULL_ERROR);
    }

    public DataNullException(Throwable cause) {
        super(cause);
        super.setCode(SystemCode.ERROR_DATA_NULL_ERROR);
    }

    public DataNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        super.setCode(SystemCode.ERROR_DATA_NULL_ERROR);
    }

    @Override
    public String getCode() {
        return super.getCode();
    }

    /**
     * 该方法被禁用
     * @param code
     */
    @Override
    public void setCode(String code) {}
}
