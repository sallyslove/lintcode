package com.lintcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eligshn on 2017/6/16.
 */
public class TreeNodeSum {

    /**
     * @param root the root of binary tree
     * @param target an integer
     * @return all valid paths
     */
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<List<Integer>> resultL = new ArrayList<List<Integer>>();
        List<List<Integer>> resultR = new ArrayList<List<Integer>>();


        List<Integer> path;

        if(null == root) {
            return result;
        }

        if (target > 0 && root.val > target) {
            return result;
        }

        if(root.val == target) {
            path = new ArrayList<Integer>();
            path.add(root.val);
            if(null == root.left && null == root.right) {
                result.add(path);
            }
        }

        if(null != root.left) {
            handleLeafNode(result, resultL, root.left, target-root.val, root.val);
        }

        if(null != root.right) {
            handleLeafNode(result, resultR, root.right, target-root.val, root.val);
        }

        return result;
    }

    private void handleLeafNode(List<List<Integer>> result, List<List<Integer>> resultL, TreeNode treeNode, int target, int val) {
        List<List<Integer>> tempResult = binaryTreePathSum(treeNode, target);
        if (null != tempResult) {
            resultL.addAll(tempResult);
        }
        for (int index = 0; index < resultL.size(); ++index) {
            List<Integer> item = resultL.get(index);
            item.add(0, val);
        }
        result.addAll(resultL);
    }

    public class TreeNode {
        public int val;

        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public void printResult(List<List<Integer>> result){
        for(int index = 0 ; index < result.size(); ++index) {
            List<Integer> item = result.get(index);
            for(int i = 0; i < item.size(); ++i) {
                System.out.print(item.get(i) + " ");
            }
            System.out.println("");
        }
    }
}
