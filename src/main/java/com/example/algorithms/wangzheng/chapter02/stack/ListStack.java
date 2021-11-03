package com.example.algorithms.wangzheng.chapter02.stack;

import com.example.algorithms.wangzheng.common.ListNode;
import lombok.ToString;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/11/2 19:51
 * @description：
 */
@ToString
public class ListStack {
    private ListNode head;
    private int count;

    public ListStack(int value) {
        this.count = value;
    }

    public boolean push(int value) {
        if (count <= 0) {
            return false;
        }
        ListNode listNode = new ListNode(value);
        listNode.next = head;
        this.head = listNode;
        --count;
        return true;
    }

    public int pop() {
        if (head == null) return -1;
        int val = head.val;
        head = head.next;
        return val;
    }

    public static void main(String[] args) {
        ListStack listStack = new ListStack(5);
        listStack.push(1);
        listStack.push(2);
        listStack.push(3);
        listStack.push(4);
        listStack.push(5);
        listStack.push(6);
        int val = 0;
        while (val != -1) {
            int pop = listStack.pop();
            if (pop != -1) {
                System.out.println("pop = " + pop);
            }
            val = pop;
        }
    }

}
