package com.navigatingcancer.codingexercise.model;

public class BasicMathResult {

    private final int parameter1;
    private final int parameter2;
    private final MathOperation operation;
    private final int result;

    public BasicMathResult(int parameter1, int parameter2, MathOperation operation, int result) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.operation = operation;
        this.result = result;
    }

    public int getParameter1() {
        return parameter1;
    }

    public int getParameter2() {
        return parameter2;
    }

    public MathOperation getOperation() {
        return this.operation;
    }

    public int getResult() {
        return result;
    }
}
