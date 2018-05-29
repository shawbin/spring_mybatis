package com.doushabao;

/**
 * 返回参数列表
 */
public enum ResultEnum {

    ERROR(0, "未知错误"), SUCCESS(1, "SUCCESS"), ERROR_NULL(100, "查询内容为空");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
