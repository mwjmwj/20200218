package com.cp.util.exception;

import com.cp.util.result.SystemCode;
import org.apache.commons.lang3.StringUtils;

public class SearchException extends RuntimeException {
    /**
     * SearchException类错误code从200000-299999
     */
    private String code;
    public SearchException() {
        this.code = SystemCode.ERROR_SEARCH_EXCEPTION;
    }

    public SearchException(String message) {
        super(message);
        this.code = SystemCode.ERROR_SEARCH_EXCEPTION;
    }

    public SearchException(String message, Throwable cause) {
        super(message, cause);
        this.code = SystemCode.ERROR_SEARCH_EXCEPTION;
    }

    public SearchException(Throwable cause) {
        super(cause);
        this.code = SystemCode.ERROR_SEARCH_EXCEPTION;
    }

    public SearchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = SystemCode.ERROR_SEARCH_EXCEPTION;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if(StringUtils.isNotBlank(code)){
            this.code = code;
        }
    }
}
