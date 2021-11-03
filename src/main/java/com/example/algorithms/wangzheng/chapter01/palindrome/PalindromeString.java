package com.example.algorithms.wangzheng.chapter01.palindrome;

import com.example.algorithms.wangzheng.common.ListNode;

/**
 * @author ：Shifty Yang
 * @date ：Created in 2021/11/2 9:52
 * @description： 如何判断一个字符串是否是回文字符串的问题，我想你应该听过，我们今天的题目就是基于这个问题的改造版本。
 * 如果字符串是通过单链表来存储的，那该如何来判断是一个回文串呢？你有什么好的解决思路呢？相应的时间空间复杂度又是多少呢？
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class PalindromeString {

    /**
     * @description：快慢指针找中点，慢指针前进过程中链表反序，从中点向两个方向验证
     */
    public static boolean isPalindromeString(ListNode head){
        if (head == null || head.next == null) {
            return true;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            //翻转链表注意两点，更新前避免丢失地址：要把slow的next指针变为prev，先要保存下一个指针。要前进的时候，先把prev更新成当前
            ListNode next = slow.next;//1.保存slow的下一个节点，避免丢失
            slow.next = prev;//2.让slow的next指针反向到上一个节点prev
            prev = slow;//3.slow准备前进一步了，把prev变成当前slow的位置
            slow = next;//4.slow前进到下一个节点
        }

        //如果是奇数就前进一步，中间的值不用比。如果是偶数，就从当前开始，一个前进一个后退
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            if (slow.val != prev.val) {
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }

        return true;
    }

    public static ListNode setNext(ListNode listNode, int value) {
        listNode.next = new ListNode(value);
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = setNext(listNode, 2);
        ListNode listNode2 = setNext(listNode1, 3);

        ListNode listNode3 = setNext(listNode2, 2);
        ListNode listNode4 = setNext(listNode3, 1);
        boolean isPalindromeString = isPalindromeString(listNode);
        System.out.println("isPalindromeString = " + isPalindromeString);
        System.out.println("listNode = " + listNode);
    }

    public static boolean testPlaindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode pre = null;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (pre != null) {
            if (slow.val != pre.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }

}
