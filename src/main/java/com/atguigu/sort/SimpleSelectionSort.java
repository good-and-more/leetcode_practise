package com.atguigu.sort;

import java.util.Arrays;

public class SimpleSelectionSort {
    public static void main(String[] args) {
        int[] arraySource = SortUtil.getArray(100);
        //int[] arraySource = new int[]{5,4,1,3,2};
        System.out.println(Arrays.toString(arraySource));

        int[] arrayResult = simpleSelectionSort(arraySource);
        System.out.println(Arrays.toString(arrayResult));
    }

    /**
     * 冒泡排序不断交换位置
     * 简单选择排序在第i轮循环中,在n-i+1个关键字找到最小的,然后直接将最小的与第i个交换
     * 即一轮找一个最小的,再出手换位置,下一轮在剩下的里找最小的,放到第二个位置
     * @param array
     * @return
     */
    public static int[] simpleSelectionSort(int[] array) {
        for(int i = 0; i <= array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j <= array.length -1; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                SortUtil.swap(array, i, min);
            }
        }
        return array;
    }
}
