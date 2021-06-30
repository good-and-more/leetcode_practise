package com.atguigu.sort;

import java.util.Arrays;

public class MergingSort {
    public static void main(String[] args) {
        int[] arraySource = SortUtil.getArray(100);
        //int[] arraySource = new int[]{5,4,1,3,2};
        System.out.println(Arrays.toString(arraySource));

        int[] arrayResult = mergingSort(arraySource);
        System.out.println(Arrays.toString(arrayResult));
    }

    /**
     * 归并排序
     * @param array
     * @return
     */
    public static int[] mergingSort(int[] array) {
        //看不懂,书上说建议用非递归方法,节约性能也节省空间
        return array;
    }
}
