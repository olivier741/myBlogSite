package com.hak.base.handler;

import com.hak.base.RestDto;
import com.hak.base.exception.MyBusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hak
 * @description
 * @date 2020/8/19
 */
@ControllerAdvice
@Slf4j
public class MyGlobalExceptionHandler {

    @ExceptionHandler(value = MyBusinessException.class)
    @ResponseBody
    public RestDto businessException(MyBusinessException e){

        String msg = "System error";
        if (e instanceof MyBusinessException){
            msg = e.getMessage();
        }
        log.error("find exception:e={}",e.getMessage());
        e.printStackTrace();
        return RestDto.error(msg);
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public RestDto elseException(Exception e){

        String msg = "System error";
        log.error("find exception:e={}",e.getMessage());
        e.printStackTrace();
        return RestDto.error(msg);
    }
}
