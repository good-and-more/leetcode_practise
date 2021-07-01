package com.atguigu.sort;

import java.util.Arrays;

public class StraightInsertionSort {
    public static void main(String[] args) {
        int[] arraySource = SortUtil.getArray(100);
        //int[] arraySource = new int[]{5,4,1,3,2};
        System.out.println(Arrays.toString(arraySource));

        int[] arrayResult = straightInsertionSort(arraySource);
        System.out.println(Arrays.toString(arrayResult));
    }

    /**
     * 直接插入排序的基本思想是：将数组中的所有元素依次跟前面已经排好的元素相比较，如果选择的元素比已排序的元素小，则交换，直到全部元素都比较过为止。
     * <li>1.从第一个元素开始，该元素可以认为已经被排序
     * <li>2.取出下一个元素，在已经排序的元素序列中从后向前扫描
     * <li>3.如果该元素（已排序）大于新元素，将该元素移到下一位置
     * <li>4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * <li>5.将新元素插入到该位置后
     * <li>6.重复步骤②~⑤<p>
     * 有两种写法,第一种是移位法,需要额外临时变量保存待插入数据
     * @param array
     * @return
     */
    public static int[] straightInsertionSort(int[] array) {
        if(array == null || array.length == 0) {
            return array;
        }

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];//将待排序的数字存入临时变量
            //要让待排序参数循环跟已排序参数比较,如果小于已排序参数,就让已排序参数往后移1个位置
            //此时需要找到已排序数组的最后一个数的下标
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {//此处注意j要>=0,意思是说当待排数挪到最前面了,就说明它最小
                //如果temp小于已排参数,就让该已排参数往后移1个,放到j+1上,执行j--
                array[j+1] = array[j];
                j--;
            }
            //直到array[j]不大于temp,说明不用往后移了,此处要想明白,经过上一轮挪动之后,j--,
            //此时array[j]<=temp,array[j+1]跟array[j+2]是重复的,[j+2]是挪过去的,[j+1]只是一个遗留的坑,应该用来插入待排序的数字
            array[j+1] = temp;//此j+1非while中的彼j+1,因为中间有个j--
        }
        return array;
    }
}
