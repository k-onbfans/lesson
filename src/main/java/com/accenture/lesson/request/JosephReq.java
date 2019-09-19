package com.accenture.lesson.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class JosephReq {

    @NotNull(message = "elements is empty")
    private String[] elements;

    @Min(value = 0,message = "startIndex must not less 0")
    private Integer startIndex;

    @Min(value = 1,message = "interval must not less 1")
    private Integer interval;
}
