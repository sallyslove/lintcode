package com.lintcode.simple;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by eligshn on 2017/7/3.
 */
public class TreeNodeSumTest {
    private TreeNodeSum func;
    TreeNodeSum.TreeNode root;
    @Before
    public void setUp(){
        func = new TreeNodeSum();
    }

    private void initTree1() {
        root = new TreeNodeSum().new TreeNode(1);
        TreeNodeSum.TreeNode node1 = new TreeNodeSum().new TreeNode(2);
        TreeNodeSum.TreeNode node2 = new TreeNodeSum().new TreeNode(4);
        root.left = node1;
        root.right = node2;
        TreeNodeSum.TreeNode node3 = new TreeNodeSum().new TreeNode(2);
        TreeNodeSum.TreeNode node4 = new TreeNodeSum().new TreeNode(3);
        node1.left = node3;
        node1.right = node4;
    }

    private void initTree2() {
        root = new TreeNodeSum().new TreeNode(37);
        TreeNodeSum.TreeNode node1 = new TreeNodeSum().new TreeNode(-34);
        TreeNodeSum.TreeNode node2 = new TreeNodeSum().new TreeNode(-48);
        root.left = node1;
        root.right = node2;
        TreeNodeSum.TreeNode node3 = new TreeNodeSum().new TreeNode(-100);
        TreeNodeSum.TreeNode node4 = new TreeNodeSum().new TreeNode(-100);
        TreeNodeSum.TreeNode node5 = new TreeNodeSum().new TreeNode(48);
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        TreeNodeSum.TreeNode node6 = new TreeNodeSum().new TreeNode(-54);
        TreeNodeSum.TreeNode node7 = new TreeNodeSum().new TreeNode(-71);
        TreeNodeSum.TreeNode node8 = new TreeNodeSum().new TreeNode(-22);
        node5.left = node6;
        node6.left = node7;
        node6.right = node8;
        TreeNodeSum.TreeNode node9 = new TreeNodeSum().new TreeNode(8);
        node8.right = node9;
    }

    private void initTree3() {
        root = new TreeNodeSum().new TreeNode(1);
        TreeNodeSum.TreeNode node1 = new TreeNodeSum().new TreeNode(1);
        TreeNodeSum.TreeNode node2 = new TreeNodeSum().new TreeNode(1);
        root.left = node1;
        root.right = node2;
        TreeNodeSum.TreeNode node3 = new TreeNodeSum().new TreeNode(3);
        TreeNodeSum.TreeNode node4 = new TreeNodeSum().new TreeNode(4);
        TreeNodeSum.TreeNode node5 = new TreeNodeSum().new TreeNode(4);
        TreeNodeSum.TreeNode node6 = new TreeNodeSum().new TreeNode(3);
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        TreeNodeSum.TreeNode node7 = new TreeNodeSum().new TreeNode(1);
        TreeNodeSum.TreeNode node8 = new TreeNodeSum().new TreeNode(5);
        TreeNodeSum.TreeNode node9 = new TreeNodeSum().new TreeNode(7);
        node4.left = node7;
        node5.left = node8;
        node6.right = node9;
    }

    private void initTree4() {
        root = new TreeNodeSum().new TreeNode(1);
        TreeNodeSum.TreeNode node1 = new TreeNodeSum().new TreeNode(3);
        TreeNodeSum.TreeNode node2 = new TreeNodeSum().new TreeNode(4);
        root.left = node1;
        root.right = node2;
        TreeNodeSum.TreeNode node3 = new TreeNodeSum().new TreeNode(2);
        TreeNodeSum.TreeNode node4 = new TreeNodeSum().new TreeNode(1);
        TreeNodeSum.TreeNode node5 = new TreeNodeSum().new TreeNode(1);
        node1.left = node3;
        node2.left = node4;
        node2.right = node5;
        TreeNodeSum.TreeNode node7 = new TreeNodeSum().new TreeNode(7);
        TreeNodeSum.TreeNode node8 = new TreeNodeSum().new TreeNode(8);
        TreeNodeSum.TreeNode node9 = new TreeNodeSum().new TreeNode(-1);
        node4.left = node7;
        node4.right = node8;
        node5.left = node9;
        TreeNodeSum.TreeNode node10 = new TreeNodeSum().new TreeNode(1);
        TreeNodeSum.TreeNode node11 = new TreeNodeSum().new TreeNode(2);
        node9.left = node10;
        node9.right = node11;
    }

    @Test
    public void testTreeNodeSum(){
        initTree1();
        List<List<Integer>> result = func.binaryTreePathSum(root, 5);
        func.printResult(result);
    }

    @Test
    public void testTreeNodeSum3(){
        initTree1();
        List<List<Integer>> result = func.binaryTreePathSum(root, 6);
        func.printResult(result);
    }

    @Test
    public void testTreeNodeSum2(){
        initTree2();
        List<List<Integer>> result = func.binaryTreePathSum(root, -31);
        func.printResult(result);
    }

    @Test
    public void testTreeNodeSum4(){
        List<List<Integer>> result = func.binaryTreePathSum(root, -31);
        func.printResult(result);
    }

    @Test
    public void testTreeNodeSum5(){
        initTree3();
        List<List<Integer>> result = func.binaryTreePathSum(root, 6);
        func.printResult(result);
    }

    @Test
    public void testTreeNodeSum6(){
        initTree4();
        List<List<Integer>> result = func.binaryTreePathSum(root, 6);
        func.printResult(result);
    }
}
