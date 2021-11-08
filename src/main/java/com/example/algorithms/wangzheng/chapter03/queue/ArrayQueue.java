package com.example.algorithms.wangzheng.chapter03.queue;

import lombok.ToString;

import java.util.Arrays;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/11/4 17:16
 * @description： 顺序队列,尾插头取
 */
@ToString
public class ArrayQueue {
    private String[] array;
    private int n;
    private int tail;
    private int head;

    public ArrayQueue(int n) {
        this.array = new String[n];
        this.n = n;
        this.tail = 0;
        this.head = 0;
    }

    public boolean push(String val) {
        if (tail == n) {
            this.array = Arrays.copyOf(array, 2 * n);
            if (head == 0) {
                return false;//表示队列满
            }
            //搬移数据
            for (int i = head; i < tail; i++) {
                array[i - head] = array[i];
            }
            tail = tail - head;
            head = 0;
        }
        this.array[tail] = val;
        ++tail;
        return true;
    }

    public String pop() {
        if (head==tail) {
            return null;
        }
        String val = this.array[head];
        ++head;
        return val;
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(4);
        arrayQueue.push("1");
        arrayQueue.push("2");
        arrayQueue.push("3");
        arrayQueue.push("4");
        arrayQueue.push("5");
        arrayQueue.push("6");
        arrayQueue.push("7");
        arrayQueue.push("8");
        System.out.println("arrayQueue.pop() = " + arrayQueue.pop());
        System.out.println("arrayQueue.pop() = " + arrayQueue.pop());
        System.out.println("arrayQueue.pop() = " + arrayQueue.pop());
        System.out.println("arrayQueue.pop() = " + arrayQueue.pop());
        System.out.println("arrayQueue.pop() = " + arrayQueue.pop());
        System.out.println("arrayQueue.pop() = " + arrayQueue.pop());
        System.out.println("arrayQueue.pop() = " + arrayQueue.pop());
        System.out.println("arrayQueue.pop() = " + arrayQueue.pop());
        System.out.println("arrayQueue.pop() = " + arrayQueue.pop());
        System.out.println("arrayQueue.pop() = " + arrayQueue.pop());
        System.out.println("arrayQueue.pop() = " + arrayQueue.pop());
    }
}
