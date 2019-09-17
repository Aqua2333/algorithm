package com.algorithm;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * @author: aqua
 * @create: 2019-09-17 10:40
 * @description 归并排序
 */
public class MergeSort {

    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(MergeSort.class);

    private static int[] sort(int[] array, int leftIndex, int rightIndex){
        if (leftIndex == rightIndex) {
            return new int[]{array[leftIndex]};
        }
            int mid = leftIndex + (rightIndex - leftIndex) / 2;
            //左有序数组
            int[] leftArr = sort(array, leftIndex, mid);
            //右有序数组
            int[] rightArr = sort(array, mid + 1, rightIndex);
            //新有序数组
            int[] newNum = new int[leftArr.length + rightArr.length];

            int m = 0, i = 0, j = 0;
            while (i < leftArr.length && j < rightArr.length) {
                newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
            }
            while (i < leftArr.length) {
                newNum[m++] = leftArr[i++];
            }
            while (j < rightArr.length) {
                newNum[m++] = rightArr[j++];
            }
            return newNum;
        }


    public static void main(String[] args) {
        int[] nums = new int[1000000];

        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1000000);
        }
        Date startDate = new Date();
        logger.info("排序开始...");
        int[] newNums = sort(nums, 0, nums.length - 1);
        logger.info("排序完成...");
        Date endDate = new Date();
        System.out.println(Arrays.toString(newNums));
        logger.info("耗时:" + (endDate.getTime() - startDate.getTime()));
    }

}