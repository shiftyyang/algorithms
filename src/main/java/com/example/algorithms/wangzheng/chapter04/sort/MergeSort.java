package com.example.algorithms.wangzheng.chapter04.sort;

import java.util.Arrays;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/12/16 1:54 下午
 * @description： 归并排序
 */
public class MergeSort {

    /**
     * @description：实现：递归 递推公式： mergeSort(arr,a,b) = merge(mergeSort(arr,a,(a+b)/2),(mergeSort(arr,(a+b)/2,b))
     */
    public static int[] doSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }



    private static int[] mergeSort(int[] arr, int start, int end) {
        //拆分
        int middle = (end + start) / 2;
        if (start >= end) {
            return arr;
        }
        mergeSort(arr, start, middle);
        mergeSort(arr, middle + 1, end);
        merge(arr, start, middle, end);
        return arr;
    }

    /**
     * @description：左右两段数组头节点，分别有一个指针向后比较，较小的数放入数组
     */
    private static void merge(int[] arr, int start, int middle, int end) {
        int p = start;
        int q = middle+1;
        int[] newArr = new int[end - start + 1];
        int i = 0;
        for (; i < newArr.length; i++) {
            // 条件，左右两段只要有一个到达终点则停止
            if (p <= middle && q <= end) {
                if (arr[p] < arr[q]) {
                    newArr[i] = arr[p++];
                } else {
                    newArr[i] = arr[q++];
                }
            } else {
                break;
            }
        }

        //while (p <= middle && q <= end) {
        //    if (arr[p] < arr[q]) {
        //        newArr[i++] = arr[p++];
        //    } else {
        //        newArr[i++] = arr[q++];
        //    }
        //}

        //剩下的都复制到新数组中
        while (p <= middle) {
            newArr[i++] = arr[p++];
        }

        //剩下的都复制到新数组中
        while (q <= end) {
            newArr[i++] = arr[q++];
        }

        for (int num : newArr) {
            arr[start++] = num;
        }
    }

    //public static void mergeSort(int[] a, int low, int high) {
    //    int mid = (low + high) / 2;
    //    if (low < high) {
    //        // 左边
    //        mergeSort(a, low, mid);
    //        // 右边
    //        mergeSort(a, mid + 1, high);
    //        // 左右归并
    //        merge(a, low, mid, high);
    //    }
    //
    //}


    public static void merge1(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2 + low] = temp[k2];
        }
    }


    public static void main(String[] args) {
        //int[] array = new int[5];
        int[] array = {0, 3, 2, 4, 0};
        //for (int i = 0; i < 4; i++) {
        //    Random random = new Random();
        //    array[i] = random.nextInt(5);
        //}
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        int[] sortedArray = doSort(array);
        System.out.println("sortedArray.toString(array) = " + Arrays.toString(sortedArray));
    }


}
