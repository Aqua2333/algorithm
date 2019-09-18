package com.algorithm;

/**
 * @author: aqua
 * @create: 2019-09-18 09:30
 * @description 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Reverse {

    public static int reverse(int x) {

        int a = 0;

        while (x != 0){
            a = a * 10 +x % 10;
            x = x / 10;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

}