package com.atguigu.sort;

import java.util.Arrays;

public class StraightInsertionSort {
    public static void main(String[] args) {
        //int[] arraySource = SortUtil.getArray(100);
        int[] arraySource = new int[]{5,4,1,3,2};
        System.out.println(Arrays.toString(arraySource));

        int[] arrayResult = straightInsertionSort(arraySource);
        System.out.println(Arrays.toString(arrayResult));
    }

    /**
     * 直插排序
     *
     * @param array
     * @return
     */
    public static int[] straightInsertionSort(int[] array) {
        //添加了一个哨兵,看不懂,等下再看
        return array;
    }
}
