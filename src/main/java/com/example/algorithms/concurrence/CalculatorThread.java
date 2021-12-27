package com.example.algorithms.concurrence;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/11/25 5:03 下午
 * @description：
 */
public class CalculatorThread extends Thread{
    @Override
    public void run() {
        System.out.println("start new Thread");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("new Thread start");
                try {
                    Thread.sleep(0,2);
                    String name = Thread.currentThread().getName();
                    System.out.println("new Thread name = " + name);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("new Thread end");
            }
        }).start();
        String name = Thread.currentThread().getName();
        System.out.println("main Thread name = " + name);
        Thread.sleep(0,1);
        System.out.println("main end");
    }
}
