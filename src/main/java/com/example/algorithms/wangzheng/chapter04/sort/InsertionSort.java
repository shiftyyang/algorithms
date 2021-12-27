package com.example.algorithms.wangzheng.chapter04.sort;

import java.util.Random;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/12/6 4:50 下午
 * @description：插入排序
 */
public class InsertionSort {

    public static int[] insertionSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        //2,4,1,3
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            for (; j > 0; j--) {
                if (temp < array[j-1]) {
                    array[j] = array[j - 1];
                } else {
                    break;
                }
            }
            array[j] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            Random random = new Random();
            array[i] = random.nextInt(10000);
        }
        int[] sortedArray = insertionSort(array);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("sortedArray = " + sortedArray[i]);

        }
    }
}
