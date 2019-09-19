package com.accenture.lesson.controller;

import com.accenture.lesson.business.LessonOneBusiness;
import com.accenture.lesson.request.JosephReq;
import com.accenture.lesson.response.JosephRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Arrays;

@Controller
@RequestMapping("/")
public class LessonOneController {

    @Autowired
    private LessonOneBusiness lessonOneBusiness;

    @PostMapping("/fibonacci/{length}")
    public @ResponseBody String showFibonacci(@PathVariable("length")Integer length,
                                                 HttpServletResponse response){
        if(length > 0){
            return Arrays.toString(lessonOneBusiness.showFibonacci(length));
        }else{
            response.setStatus(555);
            return "error request";
        }
    }

    @PostMapping("/joseph")
    public @ResponseBody JosephRes solveJosephProblem(@Valid @RequestBody JosephReq josephReq,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            JosephRes josephRes = new JosephRes();
            josephRes.setResult(bindingResult.getFieldError().getDefaultMessage());
            return josephRes;
        }
        return lessonOneBusiness.solveJosephProblem(josephReq.getElements(),
                josephReq.getStartIndex(),
                josephReq.getInterval());
    }
}
