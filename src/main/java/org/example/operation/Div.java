package org.example.operation;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Div implements Operation{
    @Override
    public String calculate(double a, double b, double c, double d) {
        double realPart = (a * c + b * d)/(c * c + d * d);
        double imaginaryPart = (b * c - a * d)/(c * c + d * d);
        String answer = realPart + " + " + imaginaryPart + "i";
        return answer;
    }
}
