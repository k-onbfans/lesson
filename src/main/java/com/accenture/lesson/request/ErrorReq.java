package com.accenture.lesson.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class ErrorReq {
    private Timestamp timestamp;
    private Integer status;
    private String error;
    private String message;

}
