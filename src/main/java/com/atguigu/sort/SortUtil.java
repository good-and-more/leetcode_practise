package com.atguigu.sort;

import java.util.Random;

public class SortUtil {
    public static int[] getArray(int length) {
        int[] array =  new int[length];
        Random random = new Random();
        for (int i = 1; i <= length; i++) {
            array[i - 1] = random.nextInt(100) + 1;
        }
        return array;
    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
