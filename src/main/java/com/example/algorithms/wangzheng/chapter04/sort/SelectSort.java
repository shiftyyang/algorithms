package com.example.algorithms.wangzheng.chapter04.sort;

import java.util.Random;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/12/7 3:55 下午
 * @description：选择排序
 */
public class SelectSort {


    public static int[] selectSort(int[] array) {
        if (array.length == 0) {
            return array;
        }


        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            Random random = new Random();
            array[i] = random.nextInt(10000);
        }
        //int[] array = {
        //        2,4,1,3
        //};
        int[] sortedArray = selectSort(array);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("sortedArray = " + sortedArray[i]);

        }
    }

}
