package com.leetCode.常见数据结构;

/**
 * @Author stan
 * @Date 2021/10/6
 * @Describe  二叉树数据结构
 * @Version 1.0
 */
public class TreeNode {
    int val;
    TreeNode left,right;

    /*二叉树递归遍历*/
    void traverse(TreeNode root) {
        // root.val;前序遍历
        traverse(root.left);
        //中序遍历
        traverse(root.right);
        //后序遍历
    }
}
