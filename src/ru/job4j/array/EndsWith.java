package ru.job4j.array;

import java.util.Objects;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1] != post[post.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
//if (word[4] != post[1] || word[3] != post[0]) {
////                result = false;
////                break;
////            }