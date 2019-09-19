package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: algorithm
 * @description: 输入一个字符串, 打印出该字符串中字符的所有排列
 * @author: aqua
 * @create: 2019-09-18 21:29
 */
public class Demo4 {

    private static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(全排列)请输入字符串：");
        String string = scanner.nextLine();

        //将输入的字符串中空格去除
        string = string.replaceAll(" ", "");
        //转换为char数组
        char[] chars = string.toCharArray();
        findCombinations(chars, 0);

        //输出
        result.forEach(System.out::println);

    }

    private static void findCombinations(char[] chars, int index) {
        char temp;
        if (index == chars.length - 1) {
            result.add(String.valueOf(chars));
        } else {
            for (int i = 0; i < chars.length; i++) {
                temp = chars[i];
                chars[i] = chars[index];
                chars[index] = temp;

                //开始递归
                findCombinations(chars, index + 1);

                temp = chars[i];
                chars[i] = chars[index];
                chars[index] = temp;

            }
        }
    }

}
