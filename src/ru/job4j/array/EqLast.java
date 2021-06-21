package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int i = 2; i <= left[2]; i++) {
            for (int j = 2; j <= right[2]; j++) {
                if (left[2] == right[2]) {
                    return true;
                }
            }
        }
        return false;
    }
}
