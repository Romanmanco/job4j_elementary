package ru.job4j.condition;

/** first больше second?
 *  first меньше second?
 *  first равна second?
 **/

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        boolean result = first > second;
                System.out.println(result);
        result = first < second;
                System.out.println(result);
        result = first == second;
                System.out.println(result);
    }
}
