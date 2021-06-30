package com.atguigu.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arraySource = SortUtil.getArray(100);
        System.out.println(Arrays.toString(arraySource));
        //int[] arraySource = new int[]{5,4,1,3,2};
        int[] arrayResult = bubbleSort2(arraySource);
        System.out.println(Arrays.toString(arrayResult));
    }

    /**
     * 最简单的交换排序,思路是从第一个开始,跟后面的每一个都比较,大的放后面去
     * 外循环第一轮就找到最小的放第一个,第二轮找到第二小的放第二个
     * @param array
     * @return
     */
    public static int[] bubbleSort1(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[i] > array[j]) {
                    SortUtil.swap(array, i ,j);
                }
            }
        }
        return array;
    }

    /**
     * 正宗冒泡排序,倒着排,较小的数字会像冒泡一样不断上浮,直到前面没有人比它小
     * @param array
     * @return
     */
    public static int[] bubbleSort2(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = array.length-1; j > i; j--) {
                if (array[j-1] > array[j]) {
                    SortUtil.swap(array, j-1 ,j);
                }
            }
        }
        return array;
    }

}
