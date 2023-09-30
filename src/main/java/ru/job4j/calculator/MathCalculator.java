package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDiv(double first, double second) {
        return difference(first, second)
                + div(first, second);
    }

    public static double allOperation(double first, double second) {
        return sum(first, second)
                + difference(first, second)
                + multiply(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + allOperation(10, 20));
    }

}
