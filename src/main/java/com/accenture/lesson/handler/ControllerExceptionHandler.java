package com.accenture.lesson.handler;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ResponseBody
    @ExceptionHandler({Exception.class})
    public Map<String,Object> exceptionHandler(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("message","input is illegal");
        return map;
    }
}
