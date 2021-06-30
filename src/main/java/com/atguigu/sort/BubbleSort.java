package com.atguigu.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //int[] arraySource = SortUtil.getArray(100);
        int[] arraySource = new int[]{1,3,4,5,2};
        System.out.println(Arrays.toString(arraySource));
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
        //i控制循环次数，长度为len的数组只需要循环len-1次，i的起始值为0所以i<len-1,例如321 循环一次变为213,再循环一次变为123,此处注意是循环少一次的
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {

            //j控制比较次数,此处i从0开始,第一次循环i=0,比较次数是len-i-1,j要能取到最后一位的值
            for (int j = i + 1; j < array.length; j++) {
                //System.out.println("排序前i = " + i + " ,数组样式为: " + Arrays.toString(array));
                if (array[i] > array[j]) {
                    SortUtil.swap(array, i ,j);
                }
            }
        }
        return array;
    }

    /**
     * 正宗冒泡排序,正排倒排都行,跟上一个的区别就是上一个是每轮循环只比特定值位置和后面所有的
     * 冒泡排序是每轮依次比临近的两个,决定是否交换,预期的数字会像冒泡一样不断上浮或者沉底
     * @param array
     * @return
     */
    public static int[] bubbleSort2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    SortUtil.swap(array, j-1 ,j);
                }
            }
        }
        return array;
    }
}
