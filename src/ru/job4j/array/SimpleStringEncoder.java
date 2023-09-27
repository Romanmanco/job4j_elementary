package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        char symbol = input.charAt(0);
        int counter = 1;
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 1; i <= input.length(); i++) {
            char myChar = i < input.length() ? input.charAt(i) : 0;
            if (i == input.length() || myChar != symbol) {
                resultBuilder.append(symbol);
                if (counter > 1) {
                    resultBuilder.append(counter);
                }
                counter = 1;
                symbol = myChar;
            } else {
                counter++;
            }
        }
        return resultBuilder.toString();
    }
}
