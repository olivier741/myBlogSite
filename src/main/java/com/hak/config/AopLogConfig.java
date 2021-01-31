package com.hak.config;

import com.alibaba.fastjson.JSON;
import eu.bitwalker.useragentutils.UserAgent;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Objects;

/**
 * @author hak
 * @description
 * @date 2020/9/28
 */
@Aspect
@Slf4j
@Component
public class AopLogConfig {

    private static final String START_TIME = "request-start";

    /**
     * Entry point
     */
    @Pointcut("execution(public * com.hak.mysite.controller.admin.*Controller.*(..))")
    public void log() {

    }

    /**
     * Pre-operation
     *
     * @param point entry point
     */
    @Before("log()")
    public void beforeLog(JoinPoint point) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        HttpServletRequest request = Objects.requireNonNull(attributes).getRequest();

        log.info("[Request URL]: {}", request.getRequestURL());
        log.info("[Request IP]: {}", request.getRemoteAddr());
        log.info("[Request class name]: {}, [Request method name]: {}", point.getSignature().getDeclaringTypeName(), point.getSignature().getName());

        Map<String, String[]> parameterMap = request.getParameterMap();
        log.info("[Request parameters]: {},", JSON.toJSONString(parameterMap));
        Long start = System.currentTimeMillis();
        request.setAttribute(START_TIME, start);
    }

    /**
     * Surround operation
     *
     * @param point entry point
     * @return Original method return value
     * @throws Throwable exception information
     */
    @Around("log()")
    public Object aroundLog(ProceedingJoinPoint point) throws Throwable {
        Object result = point.proceed();
        log.info("[Return value]: {}", JSON.toJSONString(result));
        return result;
    }

    /**
     * Post-operation
     */
    @AfterReturning("log()")
    public void afterReturning() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = Objects.requireNonNull(attributes).getRequest();

        Long start = (Long) request.getAttribute(START_TIME);
        Long end = System.currentTimeMillis();
        log.info("[Request time-consuming]: {} milliseconds", end - start);

        String header = request.getHeader("User-Agent");
        UserAgent userAgent = UserAgent.parseUserAgentString(header);
        log.info("[Browser Type]: {}, [Operating System]: {}, [Original User-Agent]: {}", userAgent.getBrowser().toString(), userAgent.getOperatingSystem().toString(), header);
    }
}
