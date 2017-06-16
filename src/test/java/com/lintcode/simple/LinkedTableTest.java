package com.lintcode.simple;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by eligshn on 2017/6/15.
 */
public class LinkedTableTest {
    private LinkedTable.ListNode head;

    @Before
    public void setUp(){
        head = new LinkedTable().new ListNode(3);
        LinkedTable.ListNode node1 = new LinkedTable().new ListNode(3);
        LinkedTable.ListNode node2 = new LinkedTable().new ListNode(8);
        LinkedTable.ListNode node3 = new LinkedTable().new ListNode(3);
        LinkedTable.ListNode node4 = new LinkedTable().new ListNode(4);

        head.next = node1;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
        node1.next = null;
    }

    @Test
    public void testRemoveElements(){
        LinkedTable table = new LinkedTable();
        table.printLinkedTable(table.removeElements(head ,3));
    }
}
