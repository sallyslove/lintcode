package com.lintcode.simple;

/**
 * Created by eligshn on 2017/6/15.
 */
public class LinkedTable {
    public ListNode removeElements(ListNode head, int val) {
        if(null == head) return null;

        ListNode currentNode = head;
        ListNode lastNode = head;

        while(null != currentNode){
            if(val == currentNode.val && head == currentNode){
                head = head.next;
                currentNode = head;
                lastNode = head;
            } else if(val == currentNode.val && head != currentNode){
                lastNode.next = currentNode.next;
                currentNode = currentNode.next;
            } else {
                lastNode = currentNode;
                currentNode = currentNode.next;
            }
        }

        return head;
    }

    public void printLinkedTable(ListNode head){
        ListNode tempNode = head;
        while (null != tempNode){
            System.out.println(tempNode.val);
            tempNode = tempNode.next;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
