package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Roman Manko";
        names[1] = "Karina Cool";
        names[2] = "Denis Sedikov";
        names[3] = "Ksenya Bondarenko";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
