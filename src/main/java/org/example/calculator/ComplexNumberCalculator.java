package org.example.calculator;

import org.example.operation.Operation;
import org.example.calculator.Calculator;
public class ComplexNumberCalculator extends Calculator {
    public void calculate(double a, double b, double c, double d, Operation operation) {
        String result = operation.calculate(a, b, c, d);
        System.out.println(result);
    }
}
