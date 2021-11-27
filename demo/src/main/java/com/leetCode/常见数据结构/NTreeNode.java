package com.leetCode.常见数据结构;

/**
 * @Author stan
 * @Date 2021/10/6
 * @Describe  N叉树数据结构
 * @Version 1.0
 */
public class NTreeNode {
    int val;
    NTreeNode[] children;

    /*N叉树遍历*/
    void traverse(NTreeNode root) {
        for (NTreeNode child : root.children)
            traverse(child);
    }
}
