package com.algorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: aqua
 * @create: 2019-09-18 13:25
 * @description 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 */
public class GenerateParenthesis {

    private static List<String> generateParenthesis(int n) {
        LinkedList<LinkedList<String>> result = new LinkedList<>();
        if (n == 0) {
            return new LinkedList<>();
        }
        LinkedList<String> list0 = new LinkedList<>();
        list0.add("");
        result.add(list0);
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("()");
        result.add(list1);
        for (int i = 2; i <= n; i++) {
            LinkedList<String> temp = new LinkedList<>();
            for (int j = 0; j < i; j++) {
                List<String> str1 = result.get(j);
                List<String> str2 = result.get(i - 1 - j);
                for (String s1 : str1) {
                    for (String s2 : str2) {
                        String el = "(" + s1 + ")" + s2;
                        temp.add(el);
                    }
                }

            }
            result.add(temp);
        }
        return result.get(n);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        generateParenthesis(n).forEach(System.out::println);
    }

}