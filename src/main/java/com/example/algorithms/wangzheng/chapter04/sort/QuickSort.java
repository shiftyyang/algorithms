package com.example.algorithms.wangzheng.chapter04.sort;

import java.util.Random;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/12/21 9:10 下午
 * @description： 快速排序
 */
public class QuickSort {

    public int[] quickSort(int[] arr, int p, int r) {
        if (p >= r) {
            return arr;
        }
        int q = partition(arr, p, r);
        quickSort(arr, p, q-1);
        quickSort(arr, q + 1, r);
        return arr;
    }

    private int partition(int[] arr, int p, int r) {
        int pivot = r;
        int i = p;
        for (int j = p; j < r; j++) {
            if (arr[j] < arr[pivot]) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, pivot);
        return i;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
        QuickSort quickSort = new QuickSort();
        int[] sortedArray = quickSort.quickSort(array,0,array.length-1);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("sortedArray = " + sortedArray[i]);

        }
    }

}
