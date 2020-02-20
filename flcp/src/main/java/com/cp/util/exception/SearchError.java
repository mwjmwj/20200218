package com.cp.util.exception;

import com.cp.util.result.SystemCode;
import org.apache.commons.lang3.StringUtils;

public class SearchError extends Exception{
    /**
     * SearchError类错误code从100000-199999
     */
    private String code;
    public SearchError() {
        super();
        this.code = SystemCode.ERROR_SEARCH_ERROR;
    }

    public SearchError(String message) {
        super(message);
        this.code = SystemCode.ERROR_SEARCH_ERROR;
    }

    public SearchError(String message, Throwable cause) {
        super(message, cause);
        this.code = SystemCode.ERROR_SEARCH_ERROR;
    }

    public SearchError(Throwable cause) {
        super(cause);
        this.code = SystemCode.ERROR_SEARCH_ERROR;
    }

    protected SearchError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = SystemCode.ERROR_SEARCH_ERROR;
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
