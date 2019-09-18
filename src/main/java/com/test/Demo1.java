package com.test;

/**
 * @program: algorithm
 * @description: 两个乒乓球队进行比赛，各出3人。甲队为A、B、C3人，乙队为X、Y、Z3人。已抽签决定比赛名单。有人向队友打听比赛的名单。A说他不和X比，C说他不和X、Z比
 * @author: aqua
 * @create: 2019-09-18 20:37
 */
public class Demo1 {

    public static void main(String[] args) {
        //A的对手
        char a = 0;
        //B的对手
        char b = 0;
        //C的对手
        char c = 0;
        //乙队人员
        char[] team = {'x', 'y', 'z'};

        for (char value : team) {
            c = value != 'x' && value != 'z' ? value : 0;
            if (c != 0) {
                break;
            }
        }
        for (char value : team) {
            a = value != 'x' && value != c ? value : 0;
            if (a != 0) {
                break;
            }
        }
        for (char value : team) {
            b = value != a && value != c ? value : 0;
            if (b != 0) {
                break;
            }
        }

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);

    }

}
