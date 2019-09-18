package com.algorithm;

import lombok.Data;

/**
 * @author: aqua
 * @create: 2019-09-18 10:09
 * @description 链表
 */
@Data
public class ListNode {

    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }

}