package com.accenture.lesson.business.impl;

import com.accenture.lesson.business.FbAndJoBusiness;
import com.accenture.lesson.response.JosephRes;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Fbonacci and Joseph problem businesses' implements
 * @author yifei.zhu
 */
@Service
public class FbAndJoBusinessImpl implements FbAndJoBusiness {

    /**
     * show Fibonacci number
     * @param length how many Fibonacci number
     * @return A Integer array containing Fibonacci numbers
     */
    @Override
    public BigInteger[] showFibonacci(Integer length){
        /**
         * the first Fibonacci number
         */
        BigInteger first = BigInteger.valueOf(0);
        /**
         * the second Fibonacci number
         */
        BigInteger second = BigInteger.valueOf(1);
        BigInteger[] result= new BigInteger[length];
        result[0] = first;
        if(length > 1){
            result[1] = second;
            if(length > 2){
                for(Integer i = 2;i < length;i++){
                    result[i] = result[i-1].add(result[i-2]);
                }
            }
        }
        return result;
    }

    /**
     * solve Joseph problem
     * @param elements contaning some members
     * @param startIndex which to start
     * @param interval how many to skip
     * @return the last menber in joseph circle
     */
    @Override
    public JosephRes solveJosephProblem(String[] elements,Integer startIndex,Integer interval) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,elements);
        int num = startIndex;
        list.remove(num);
        while(list.size() > 1){
            num = num + interval - 1;
            if(num > list.size()-1){
                while(num > list.size()-1){
                    num = num - list.size();
                }
                list.remove(num);
            }else{
                list.remove(num);
            }
        }
        JosephRes josephRes = new JosephRes();
        josephRes.setLastElement(list.get(0));
        return josephRes;
    }
}
