package com.test;

import java.util.Scanner;

/**
 * @program: algorithm
 * @description: 输入的一个字符串，判断这个字符串是否对称
 * @author: aqua
 * @create: 2019-09-18 20:56
 */
public class Demo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("(判断是否对称)请输入字符串：");
        String string = scanner.nextLine();
        //将所有空格删除
        string = string.replaceAll(" ", "");
        //字符串长度的一半
        int len = string.length() / 2;
        //是否对称
        boolean isBalance = true;
        //首尾索引位置的字符进行对比 若出现不一致 则为不对称
        for (int i = 0; i < len; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                isBalance = false;
                break;
            }
        }

        if (isBalance) {
            System.out.println("该字符串对称");
        } else {
            System.out.println("该字符串不对称");
        }

    }

}
