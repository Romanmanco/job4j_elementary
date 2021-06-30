package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] data = new int[size][size];
        for (int row = 0; row < data.length; row++) {
            for (int column = 0; column < data[row].length; column++) {
                data[row][column] = (row) * (column);
            }
        }
        return data;
    }
}
