package com.spring.utils;

import com.spring.domain.Result;

/**
 * HTTP请求返回的最外层对象工具类
 *
 * Created by lianhw on 2017/8/13.
 */
public class ResultUtil {

    /**
     * 成功犯法
     *
     * @param object 返回结果对象
     * @return result
     */
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMeg("成功");
        result.setData(object);
        return result;
    }

    /**
     * 成功犯法
     *
     * @return null
     */
    public static Result success(){
        return null;
    }

    /**
     * 失败方法
     *
     * @param code 错误代码
     * @param msg 错误信息
     * @return result
     */
    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMeg(msg);
        return result;
    }

}
