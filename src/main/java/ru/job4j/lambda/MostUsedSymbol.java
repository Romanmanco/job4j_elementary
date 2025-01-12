package ru.job4j.lambda;

import java.util.HashMap;
import java.util.Map;

public class MostUsedSymbol {
    public static void main(String[] args) {
        String input = "fuuuuuuuuuuuked mind".replaceAll(" ", "");
        Map<Character, Integer> map = new HashMap<>();
        for (char character : input.toCharArray()) {
            map.merge(character, 1, Integer::sum);
        }
        int max = 0;
        char result = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        System.out.println("Most used symbol: " + result);
    }
}
