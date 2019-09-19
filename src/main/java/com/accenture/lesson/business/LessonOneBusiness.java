package com.accenture.lesson.business;


import com.accenture.lesson.response.JosephRes;

public interface LessonOneBusiness {

    public Integer[] showFibonacci(Integer length);

    public JosephRes solveJosephProblem(String[] elements,Integer startIndex,Integer intervel);
}
