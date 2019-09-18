package com.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: aqua
 * @create: 2019-09-18 10:49
 * @description 定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (int end = 0, start = 0; end < n; end++) {
                char alpha = s.charAt(end);
                if (map.containsKey(alpha)) {
                    start = Math.max(map.get(alpha), start);
                }
                ans = Math.max(ans, end - start + 1);
                map.put(s.charAt(end), end + 1);
            }
            return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

}