package com.accenture.lesson.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Arrays;


public class JosephReq {

    @NotNull(message = "elements is empty")
    private String[] elements;

    @Min(value = 0,message = "startIndex must not less 0")
    private Integer startIndex;

    @Min(value = 1,message = "interval must not less 1")
    private Integer interval;

    public String[] getElements() {
        return elements;
    }

    public void setElements(String[] elements) {
        this.elements = elements;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    @Override
    public String toString() {
        return "JosephReq{" +
                "elements=" + Arrays.toString(elements) +
                ", startIndex=" + startIndex +
                ", interval=" + interval +
                '}';
    }
}
