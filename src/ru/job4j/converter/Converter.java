package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;

    }

    public static int rubleToDollar(int value) {
        return value / 60;

    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int in1 = 5210;
        int expected1 = 86;
        int out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("5210 rubles are 86. Test result : " + passed1);

        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(5210);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("5210 rubles are " + dollar + " dollar.");

    }
}
