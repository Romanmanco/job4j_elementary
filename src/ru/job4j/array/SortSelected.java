package ru.job4j.array;

import static ru.job4j.array.SwitchArray.swap;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i <= data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoop.indexOf(data, min, 0, data.length);
            for (int j = index; j < data.length; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            swap(data, index, min);
        }
        return data;
    }
}
