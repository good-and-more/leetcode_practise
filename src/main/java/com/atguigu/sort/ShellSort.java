package com.atguigu.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        //int[] arraySource = SortUtil.getArray(100);
        int[] arraySource = new int[]{5,4,1,3,2};
        System.out.println(Arrays.toString(arraySource));

        int[] arrayResult = shellSort(arraySource);
        System.out.println(Arrays.toString(arrayResult));
    }

    /**
     * 一种分组的直插排序,看不懂
     *
     * @param array
     * @return
     */
    public static int[] shellSort(int[] array) {
        //添加了一个哨兵,看不懂,等下再看
        return array;
    }
}
