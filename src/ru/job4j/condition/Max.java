package ru.job4j.condition;

public class Max {
    @SuppressWarnings("checkstyle:InnerAssignment")
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int rsl = Max.max(2143235, 35654);
        System.out.println(rsl);
    }
}
