package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndMultiply(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sum(first, second)
                + subtraction(first, second)
                + multiply(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета subAndMultiply: " + subAndMultiply(10, 20));
        System.out.println("Результат расчета sumAllOperations: " + sumAllOperations(10, 20));
    }
}
