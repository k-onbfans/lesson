package com.accenture.lesson.lesson1.controller;

import com.accenture.lesson.lesson1.business.LessonOneBusiness;
import com.accenture.lesson.request.JosephReq;
import com.accenture.lesson.response.JosephRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class LessonOneController {

    @Autowired
    private LessonOneBusiness lessonOneBusiness;

    @PostMapping("/fibonacci/{length}")
    public @ResponseBody Integer[] showFibonacci(@PathVariable("length")Integer length){
        return lessonOneBusiness.showFibonacci(length);
    }

    @PostMapping("/joseph")
    public @ResponseBody JosephRes solveJosephProblem(@RequestBody JosephReq josephReq){
        return lessonOneBusiness.solveJosephProblem(josephReq.getElements(),
                josephReq.getStartIndex(),
                josephReq.getIntervel());
    }
}
