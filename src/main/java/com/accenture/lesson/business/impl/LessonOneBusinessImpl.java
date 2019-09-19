package com.accenture.lesson.business.impl;

import com.accenture.lesson.business.LessonOneBusiness;
import com.accenture.lesson.response.JosephRes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class LessonOneBusinessImpl implements LessonOneBusiness {


    @Override
    public Integer[] showFibonacci(Integer length){
        Integer first = 0;
        Integer second = 1;
        Integer[] result= new Integer[length];
        result[0] = first;
        if(length > 1){
            result[1] = second;
            if(length > 2){
                for(Integer i = 2;i < length;i++){
                    result[i] = result[i-1] + result[i-2];
                }
            }
        }
        return result;
    }

    @Override
    public JosephRes solveJosephProblem(String[] elements,Integer startIndex,Integer interval) {
        List<String> list = new ArrayList<String>(elements.length);
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
