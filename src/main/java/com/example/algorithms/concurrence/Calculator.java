package com.example.algorithms.concurrence;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/11/25 5:00 下午
 * @description：
 */
public class Calculator {
    static int value = 0;
    public synchronized static int get() {
        return value;
    }

    public synchronized static void add() {
        value++;
    }

    public static void main(String[] args) {

    }

}
