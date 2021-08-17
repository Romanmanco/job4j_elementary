package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        return Math.max(
                first, max(second, third)
        );
    }

    public static int max(int first, int second, int third, int fourth) {
        return Math.max(
                max(first, second), max(third, fourth)
        );
    }

    public static void main(String[] args) {
        int rsl = Max.max(max(2424, 233231), max(2321, 23424));
        System.out.println(rsl);
    }
}
