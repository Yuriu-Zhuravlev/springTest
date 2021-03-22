package com.pract.controller;

import com.pract.beean.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CalcController {
    private static int count = 0;
    private static List<Operation> operations = new ArrayList<>();

    @RequestMapping(value = "/startCalculator", method = RequestMethod.GET)
    public ModelAndView viewAllStudents(){
        return new ModelAndView("calculator","count",count);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView add(){
        return new ModelAndView("operationAdd","command",new Operation());
    }

    @RequestMapping(value = "/addPost", method = RequestMethod.POST)
    public ModelAndView addPost(@ModelAttribute Operation operation){
        count += operation.getValue();
        operations.add(new Operation(operation.getValue(),"додавання"));
        return new ModelAndView("redirect:/startCalculator");
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.GET)
    public ModelAndView subtract(){
        return new ModelAndView("operationSubtrack","command",new Operation());
    }

    @RequestMapping(value = "/subPost", method = RequestMethod.POST)
    public ModelAndView subPost(@ModelAttribute Operation operation){
        count -= operation.getValue();
        operations.add(new Operation(operation.getValue(),"віднімання"));
        return new ModelAndView("redirect:/startCalculator");
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public ModelAndView multiply(){
        return new ModelAndView("operationMultiply","command",new Operation());
    }

    @RequestMapping(value = "/multPost", method = RequestMethod.POST)
    public ModelAndView multPost(@ModelAttribute Operation operation){
        count *= operation.getValue();
        operations.add(new Operation(operation.getValue(),"множення"));
        return new ModelAndView("redirect:/startCalculator");
    }

    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public ModelAndView divide(){
        return new ModelAndView("operationDivide","command",new Operation());
    }

    @RequestMapping(value = "/divPost", method = RequestMethod.POST)
    public ModelAndView saveStudent(@ModelAttribute Operation operation){
        count /= operation.getValue();
        operations.add(new Operation(operation.getValue(),"ділення"));
        return new ModelAndView("redirect:/startCalculator");
    }
}
