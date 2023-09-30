package ru.job4j.condition;

public class Games {
    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("Start - super mario");
        }
        if (name.equals("tanks")) {
            System.out.println("Start - tanks");
        }
        if (name.equals("trtis")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Games.menu("tanks");
    }
}
