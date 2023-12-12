package org.example.operation;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Mult implements Operation{
    @Override
    public String calculate(double a, double b, double c, double d) {
        double realPart = a * c - b * d;
        double imaginaryPart = b * c + a * d;
        String answer = realPart + " + " + imaginaryPart + "i";
        return answer;
    }
}
