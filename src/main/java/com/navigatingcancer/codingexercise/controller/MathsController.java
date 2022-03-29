package com.navigatingcancer.codingexercise.controller;

import com.fasterxml.jackson.databind.ext.Java7Handlers;
import com.navigatingcancer.codingexercise.model.BasicMathResult;
import com.navigatingcancer.codingexercise.model.MathOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Integer;

@RestController
public class MathsController {

    @GetMapping("/math/add")
    public BasicMathResult addTwoIntegers(@RequestParam int parameter1,
                                          @RequestParam int parameter2){
        // FIX: parameter one was being added to itself for result. Now properly adds parameter 1 to parameter 2
        if (parameter1+parameter2 > Integer.MAX_VALUE || parameter1+parameter2 < Integer.MIN_VALUE) throwIntegerOverflow();
        return new BasicMathResult(parameter1, parameter2, MathOperation.ADDITION, parameter1 + parameter2);
    }

    // Added new subtraction endpoint her
    @GetMapping("/math/subtract")
    public BasicMathResult subtractTwoIntegers(@RequestParam int parameter1,
    @RequestParam int parameter2){
        if (parameter1-parameter2 > Integer.MAX_VALUE || parameter1-parameter2 < Integer.MIN_VALUE) throwIntegerOverflow();
        return new BasicMathResult(parameter1, parameter2, MathOperation.SUBTRACTION, parameter1 - parameter2);
    }

    private static void throwIntegerOverflow(){
        throw new IllegalArgumentException("Parameters Have Overflowed Application bounds. Please select new parameters");
    }
}
