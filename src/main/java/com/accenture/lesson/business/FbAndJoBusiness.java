package com.accenture.lesson.business;


import com.accenture.lesson.response.JosephRes;

import java.math.BigInteger;

public interface FbAndJoBusiness {

    public BigInteger[] showFibonacci(Integer length);

    public JosephRes solveJosephProblem(String[] elements,Integer startIndex,Integer intervel);
}
