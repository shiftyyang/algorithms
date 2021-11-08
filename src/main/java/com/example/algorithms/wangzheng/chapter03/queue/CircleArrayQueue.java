package com.example.algorithms.wangzheng.chapter03.queue;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/11/5 15:09
 * @description： 循环队列
 */
public class CircleArrayQueue {
    private String[] array;

    private int n;

    private int head;

    private int tail;

    public CircleArrayQueue(int n) {
        this.array = new String[n];
        this.n = n;
        this.head = 0;
        this.tail = 1;
    }

    public boolean push(String val) {
        if ((tail + 1) % n == head) {
            return false;
        }
        array[tail] = val;
        tail = (tail + 1) % n;
        return true;
    }

    public String pop() {
        if (head == tail) {
            return null;
        }
        String val = array[head];
        head = (head + 1) % n;
        return val;
    }

    public static void main(String[] args) {
        CircleArrayQueue circleArrayQueue = new CircleArrayQueue(10);
        circleArrayQueue.push("1");
        circleArrayQueue.push("2");
        circleArrayQueue.push("3");
        circleArrayQueue.push("4");
        circleArrayQueue.push("5");
        circleArrayQueue.push("6");
        circleArrayQueue.push("7");
        circleArrayQueue.push("8");
        for (int i = 0; i < 12; i++) {
            System.out.println("circleArrayQueue.pop() = " + circleArrayQueue.pop());
        }
    }
}
