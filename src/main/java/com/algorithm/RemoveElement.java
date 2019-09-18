package com.algorithm;

/**
 * @author: aqua
 * @create: 2019-09-18 15:55
 * @description 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int len = removeElement(nums,2);

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

}