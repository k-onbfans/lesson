package com.accenture.lesson.lesson1.business;


import com.accenture.lesson.request.JosephReq;
import com.accenture.lesson.response.JosephRes;

public interface LessonOneBusiness {

    public Integer[] showFibonacci(Integer length);

    public JosephRes solveJosephProblem(String[] elements,Integer startIndex,Integer intervel);
}
