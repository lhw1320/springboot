package com.spring.enums;

/**
 * 返回结果错误代码和错误异常信息管理枚举
 *
 * Created by lianhw on 2017/8/13.
 */
public enum ResultEnum {

    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    NEW(100, "新生代"),
    MIDDLE(101, "中生代");

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
