package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        int count = 2;
        for (int i = count; i < number; i++) {
            if ((number % i) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
