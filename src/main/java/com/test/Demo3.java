package com.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: algorithm
 * @description: 有N个人，从1到N编号，按照编号顺序围成一圈。从第一个人开始报数(从1报到3)，凡报到3的人退出圈子 问：最后留下的人的编号是几号。
 * @author: aqua
 * @create: 2019-09-18 21:07
 */
public class Demo3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("请输入排成一圈的人数：");
        int n = s.nextInt();
        boolean[] arr = new boolean[n];

        // 数组赋值都是true
        Arrays.fill(arr, true);

        //剩下的人数
        int leftCount = n;
        //计数器
        int countNum = 0;
        //索引值
        int index = 0;
        while (leftCount > 1) {
            if (arr[index]) {
                countNum++;
                if (countNum == 3) {
                    countNum = 0;
                    arr[index] = false;
                    leftCount--;
                }
            }
            index++;
            if (index == n) {
                index = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]) {
                System.out.println("原排在第" + (i + 1) + "位的人留下了。");
            }
        }
    }


}
