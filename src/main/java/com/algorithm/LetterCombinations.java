package com.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author: aqua
 * @create: 2019-09-18 14:00
 * @description 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 */
public class LetterCombinations {

    private static ArrayList<String> list = new ArrayList<>();

    private static HashMap<Character, String[]> map = new HashMap<>(10);

    public static List<String> letterCombinations(String digits) {

        map.put('2', new String[]{"a", "b", "c"});
        map.put('3', new String[]{"d", "e", "f"});
        map.put('4', new String[]{"g", "h", "i"});
        map.put('5', new String[]{"j", "k", "l"});
        map.put('6', new String[]{"m", "n", "o"});
        map.put('7', new String[]{"p", "q", "r", "s"});
        map.put('8', new String[]{"t", "u", "v"});
        map.put('9', new String[]{"w", "x", "y", "z"});

        if ("".equals(digits)) {
            return new ArrayList<>();
        } else {
            findCombinations(digits, 0, "");
        }
        return list;
    }

    private static void findCombinations(String digits, int index, String s) {
        if (index == digits.length()) {
            list.add(s);
        } else {
            Character character = digits.charAt(index);
            String[] strings = map.get(character);

            for (String string : strings) {
                findCombinations(digits, index + 1, s + string);
            }
        }
    }

    public static void main(String[] args) {
        letterCombinations("233").forEach(System.out::println);
    }

}