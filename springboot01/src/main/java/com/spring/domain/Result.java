package com.spring.domain;

/**
 * HTTP请求返回的最外层对象
 *    返回结果统一处理
 *
 * Created by lianhw on 2017/8/13.
 */
public class Result<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String meg;

    /**
     * 具体的内容
     */
    private T data;

    public Result() {}

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
