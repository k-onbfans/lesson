package com.accenture.lesson.controller;

import com.accenture.lesson.business.FbAndJoBusiness;
import com.accenture.lesson.request.JosephReq;
import com.accenture.lesson.response.JosephRes;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Arrays;

@Controller
@Log4j2
@RequestMapping("/")
public class FbAndJoController {

    @Autowired
    private FbAndJoBusiness fbAndJoBusiness;

    @PostMapping("/fibonacci/{length}")
    public @ResponseBody String showFibonacci(@PathVariable("length")Integer length){

        return Arrays.toString(fbAndJoBusiness.showFibonacci(length));
    }

    @PostMapping("/joseph")
    public @ResponseBody JosephRes solveJosephProblem(@Valid @RequestBody JosephReq josephReq){
        return fbAndJoBusiness.solveJosephProblem(josephReq.getElements(),
                josephReq.getStartIndex(),
                josephReq.getInterval());
    }
}
