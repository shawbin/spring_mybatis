package com.doushabao.framework.exceptiondeal;

/**
 * 自定义的全局异常
 */
public class GlobalException extends RuntimeException {

    //异常信息
    private Integer code;

    public GlobalException (Integer code, String messge) {
        super(messge);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
