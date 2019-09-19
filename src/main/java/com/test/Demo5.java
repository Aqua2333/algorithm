package com.test;

import java.util.Scanner;

/**
 * @program: algorithm
 * @description: 输入两个字符串，从第一个字符串中删除第二个字符串中所有的字符
 * @author: aqua
 * @create: 2019-09-19 21:08
 */
public class Demo5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(去重)请输入一个字符串:");
        String string = scanner.nextLine();
        System.out.println("(根据这个删除)请输入第二个字符串:");
        String del = scanner.nextLine();

        StringBuilder result= new StringBuilder();
        int index;
        for (int i = 0; i < string.length(); i++) {
            index=1;
            for (int j = 0; j < del.length(); j++) {
                if (del.charAt(j) == string.charAt(i)){
                    index++;
                }
            }
            if (index == 1){
                result.append(string.charAt(i));
            }
        }
        System.out.println("结果为:" + result);
    }

}
