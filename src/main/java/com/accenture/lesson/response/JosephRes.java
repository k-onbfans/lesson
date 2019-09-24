package com.accenture.lesson.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JosephRes {
    private String lastElement;
    private String result;

    public String getLastElement() {
        return lastElement;
    }

    public void setLastElement(String lastElement) {
        this.lastElement = lastElement;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "JosephRes{" +
                "lastElement='" + lastElement + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
