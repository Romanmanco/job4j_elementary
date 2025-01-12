package ru.job4j.array;

/** заполнить массив через цикл элементами от 0 до bound,
 * возведенными в квадрат
 * */

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(5);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
