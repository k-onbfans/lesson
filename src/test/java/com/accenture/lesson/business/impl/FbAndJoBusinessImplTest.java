package com.accenture.lesson.business.impl;

import com.accenture.lesson.business.FbAndJoBusiness;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class FbAndJoBusinessImplTest {

    @Autowired
    private FbAndJoBusiness fbAndJoBusiness;

    @Test
    void showFibonacci() {

        Integer expected = 0;
        Integer result = fbAndJoBusiness.showFibonacci(1)[fbAndJoBusiness.showFibonacci(1).length-1];
        assertEquals(expected,result);

        expected = 3;
        result = fbAndJoBusiness.showFibonacci(5)[fbAndJoBusiness.showFibonacci(5).length-1];
        assertEquals(expected,result);

        expected = 34;
        result = fbAndJoBusiness.showFibonacci(10)[fbAndJoBusiness.showFibonacci(10).length-1];
        assertEquals(expected,result);
    }

    @Test
    void solveJosephProblem() {
        String expected = "c";
        String result = fbAndJoBusiness.solveJosephProblem(new String[]{"a", "b", "c"},0,1).getLastElement();
        assertEquals(expected,result);

        expected = "d";
        result = fbAndJoBusiness.solveJosephProblem(new String[]{"a","b","c","d","e"},1,4).getLastElement();
        assertEquals(expected,result);

        expected = "a";
        result = fbAndJoBusiness.solveJosephProblem(new String[]{"a","b","c","d","e"},4,3).getLastElement();
        assertEquals(expected,result);

    }
}