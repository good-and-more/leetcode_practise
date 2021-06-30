package com.atguigu.sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arraySource = SortUtil.getArray(100);
        //int[] arraySource = new int[]{5,4,1,3,2};
        System.out.println(Arrays.toString(arraySource));

        int[] arrayResult = heapSort(arraySource);
        System.out.println(Arrays.toString(arrayResult));
    }

    /**
     * 对简单选择排序的优化,在每一轮比较时,除了获得最小值,还根据比较结果对其他记录做相应的调整
     * @param array
     * @return
     */
    public static int[] heapSort(int[] array) {
        //代码不会写
        return array;
    }
}
