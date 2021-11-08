package com.example.algorithms.wangzheng.chapter03.queue;

import com.example.algorithms.wangzheng.common.ListNode;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/11/4 17:43
 * @description： 链式队列
 */
public class ListQueue {
    private ListNode head;
    private ListNode tail;

    public ListQueue() {
    }

    public boolean push(String value) {
        ListNode listNode = new ListNode(value);
        if (this.head == null) {
            this.head = listNode;
        }
        if (tail == null) {
            this.tail = listNode;
        }else {
            this.tail.next = listNode;
            this.tail = this.tail.next;
        }
        return true;
    }

    public String pop() {
        if (this.head == null) {
            return null;
        }
        ListNode listNode = this.head;
        this.head = this.head.next;
        return listNode.str;
    }

    public static void main(String[] args) {
        ListQueue listQueue = new ListQueue();
        listQueue.push("1");
        listQueue.push("2");
        listQueue.push("3");
        listQueue.push("4");
        listQueue.push("5");
        System.out.println("listQueue.pop() = " + listQueue.pop());
        System.out.println("listQueue.pop() = " + listQueue.pop());
        System.out.println("listQueue.pop() = " + listQueue.pop());
        System.out.println("listQueue.pop() = " + listQueue.pop());
        System.out.println("listQueue.pop() = " + listQueue.pop());
        System.out.println("listQueue.pop() = " + listQueue.pop());
        listQueue.push("6");
        listQueue.push("7");
        System.out.println("listQueue = " + listQueue.pop());
        System.out.println("listQueue = " + listQueue.pop());
        System.out.println("listQueue = " + listQueue.pop());
        System.out.println("listQueue = " + listQueue.pop());

    }
}
