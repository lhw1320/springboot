package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * HTTP请求日志记录切面
 *
 * Created by lianhw on 2017/8/13.
 */
@Aspect
@Component("httpAspect")
public class HttpAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.spring.web.controller.GirlController.*(..))")
    public void printLog(){}

    @Before("printLog()")
    public void printLogBefore(JoinPoint point){
        LOGGER.info("Contro类中的方法执行之前");

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //url
        LOGGER.info("url={}", request.getRequestURL());

        //method
        LOGGER.info("method={}", request.getMethod());

        //ip
        LOGGER.info("ip={}", request.getRemoteAddr());

        //类方法
        LOGGER.info("class_method={}", point.getSignature().getDeclaringTypeName()
                + "." + point.getSignature().getName());

        //参数
        LOGGER.info("args={}", point.getArgs());
    }

    @After("printLog()")
    public void printLogAfter(){
        LOGGER.info("Contro类中的方法执行之后");
    }

    @AfterReturning(returning = "object", pointcut = "printLog()")
    public void AfterReturning(Object object){
        LOGGER.info("response={}", object);
    }

}
