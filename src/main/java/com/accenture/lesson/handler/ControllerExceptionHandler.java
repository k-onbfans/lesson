package com.accenture.lesson.handler;

import com.accenture.lesson.request.ErrorReq;
import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@ControllerAdvice
public class ControllerExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public List<ErrorReq> exceptionHandlerForMANVE(MethodArgumentNotValidException e){
        List<ErrorReq> list = new ArrayList<>();
        for (ObjectError obje:e.getBindingResult().getAllErrors()) {
            ErrorReq errorReq = new ErrorReq();
            errorReq.setTimestamp(new Timestamp(System.currentTimeMillis()));
            errorReq.setError("Illegal parameter");
            errorReq.setMessage(obje.getDefaultMessage());
            errorReq.setStatus(HttpStatus.BAD_REQUEST.value());
            list.add(errorReq);
        }
        return list;
    }

}
