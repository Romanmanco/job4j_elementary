package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 1; i < board.length; i++) {
            if (board[i - 1] == board[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
