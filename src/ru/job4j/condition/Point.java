package ru.job4j.condition;

import static java.lang.Math.sqrt;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return  sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result1 = Point.distance(1, 3, 8, 6);
        double result2 = Point.distance(0, 2, 12, 8);
        double result3 = Point.distance(9, 13, 8, 3);
        System.out.println("result (8, 1) to (6, 3) " + result1);
        System.out.println("result (12, 0) to (8, 2) " + result2);
        System.out.println("result (8, 9) to (3, 13) " + result3);
    }
}
