package com.leetCode.常见数据结构;

/**
 * @Author stan
 * @Date 2021/10/6  单链表结构
 * @Version 1.0
 */
public class ListNode {
    int val; //当前值，
    ListNode next;  //指向下一个节点

    /*迭代访问*/
    void traverse1(ListNode head) {
        for(ListNode p = head; p != null;p = p.next){
            System.out.println( p.val); //迭代访问
        }
    }
    void traverse(ListNode head) {
        // 递归访问 head.val
        if(head!=null){
            System.out.println( head.val);
        }
        traverse(head.next);
    }
}
