package com.atguigu.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        //int[] arraySource = SortUtil.getArray(100);
        int[] array = new int[]{6,1,2,7,9,3,4,5,8};
        System.out.println(Arrays.toString(array));

        quickSort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 对冒泡排序的优化
     * 1.选择第一个元素当中间元素,比它小的放左边,比它大的放右边
     * 2.左边的元素,选第一个当中间元素,比它小的放左边,比它大的放右边,右边的元素,选第一个当中间元素,同样操作
     * 重复上述过程,直到最底层,形成一个递归,最后回收,就是排序好的,具体实现手段有挖坑法和左右指针法
     * 快速排序（挖坑法递归）
     * @param arr   待排序数组
     * @param low   左边界
     * @param high  右边界
     */
    public static void quickSort(int arr[], int low, int high) {
        if (arr == null || arr.length <= 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int left = low;
        int right = high;
        int temp = arr[left]; //挖坑1：保存基准的值

        while (left < right) {
            while (left < right && arr[right] >= temp) {
                right--;
            }
            arr[left] = arr[right]; //坑2：从后向前找到比基准小的元素，插入到基准位置坑1中
            while (left < right && arr[left] <= temp) {
                left ++;
            }
            arr[right] = arr[left]; //坑3：从前往后找到比基准大的元素，放到刚才挖的坑2中
        }
        arr[left] = temp; //基准值填补到坑3中，准备分治递归快排
        System.out.println("Sorting: " + Arrays.toString(arr));
        quickSort(arr, low, left-1);
        quickSort(arr, left + 1, high);
    }

    /**
     * 快速排序（左右指针法）
     * @param arr 待排序数组
     * @param low 左边界
     * @param high 右边界
     */
    public static void sort2(int arr[], int low, int high) {
        if (arr == null || arr.length <= 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int left = low;
        int right = high;

        int key = arr[left];

        while (left < right) {
            while (left < right && arr[right] >= key) {
                right--;
            }
            while (left < right && arr[left] <= key) {
                left++;
            }
            if (left < right) {
                SortUtil.swap(arr, left, right);
            }
        }
        SortUtil.swap(arr, low, left);
        System.out.println("Sorting: " + Arrays.toString(arr));
        sort2(arr, low, left - 1);
        sort2(arr, left + 1, high);
    }
}
