package com.algorithm;

import java.util.Arrays;

/**
 * @author: aqua
 * @create: 2019-09-18 09:16
 * @description 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        //记录下标索引
        int firstIndex = 0;
        int nextIndex = 0;
        for (int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if (i == j){
                    continue;
                }
                if (target == (nums[i] + nums[j])){
                    firstIndex = i;
                    nextIndex = j;
                    break;
                }
            }
        }
        return new int[]{firstIndex,nextIndex};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] num = twoSum(nums,9);
        System.out.println(Arrays.toString(num));
    }

}