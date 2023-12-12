package org.example;

import org.example.calculator.*;
import org.example.operation.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operation sum = new Sum();
        Operation mult = new Mult();
        Operation div = new Div();

        System.out.println("Добро пожаловать в калькулятор комплексных чисел." +
                "\nДва комплексных числа представлены в калькуляторе в виде (a+bi) и (c+di)");
        System.out.print("Введите число а: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите число c: ");
        double c = scanner.nextDouble();
        System.out.print("Введите число d: ");
        double d = scanner.nextDouble();
        ComplexNumberCalculator calculator = new ComplexNumberCalculator();
        System.out.print("Сумма (" + a + " + " + b + "i) + (" + c + " + " + d + "i) = ");
        calculator.calculate(a, b, c, d, sum);
        System.out.print("Умножение (" + a + " + " + b + "i) * (" + c + " + " + d + "i) = ");
        calculator.calculate(a, b, c, d, mult);
        System.out.print("Деление (" + a + " + " + b + "i) / (" + c + " + " + d + "i) = ");
        calculator.calculate(a, b, c, d, div);
    }
}