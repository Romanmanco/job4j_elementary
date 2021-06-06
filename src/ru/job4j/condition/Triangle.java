package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
    }

    public static void main(String[] args) {
        System.out.println(exist(1, 1, 1));
        System.out.println(exist(3, 6, 8));
        System.out.println(exist(0, 5, 9));
    }
}
