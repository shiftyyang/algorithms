package com.example.algorithms.concurrence;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/11/25 5:58 下午
 * @description：
 */
public class CalculatorRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("start new Thread of Runnable");
    }

    public static void main(String[] args) {
        new Thread(new CalculatorRunnable()).start();

        new Thread(() -> System.out.println("start new Thread of no")).start();
    }

}
