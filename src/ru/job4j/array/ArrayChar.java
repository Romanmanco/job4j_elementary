package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i <= word[1]; i++) {
            int a = word[1];
            for (int j = 0; j <= pref[1]; j++) {
                if (a != pref[1]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
