package ru.job4j;

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);

    }

    public static void main(String[] args) {
        String name = "Roman Manko";
        int age = 33;

        ArgMethod.hello(name, age);


    }
}

