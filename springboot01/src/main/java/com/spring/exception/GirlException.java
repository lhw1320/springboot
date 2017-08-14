package com.spring.exception;

import com.spring.enums.ResultEnum;

/**
 * 自定义异常类GirlException
 *
 * Created by lianhw on 2017/8/13.
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
