package com.example.algorithms.wangzheng.chapter04.sort;

import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/12/5 10:57 下午
 * @description： 冒泡排序
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            return array;
        }

        for (int i = 0; i < array.length; i++){
            boolean flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return array;
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
        int[] sortedArray = bubbleSort(array);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("sortedArray = " + sortedArray[i]);

        }
    }
}
