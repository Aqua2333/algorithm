package com.algorithm;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * @author: aqua
 * @create: 2019-09-17 09:06
 * @description 插入排序 类似于排序扑克牌
 */
public class InsertionSort {

    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(InsertionSort.class);

    public static void main(String[] args) {

        int[] nums = new int[1000000];

        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1000000);
        }
        Date startDate = new Date();
        int[] sortedArr = sort(nums);
        Date endDate = new Date();
        System.out.println(Arrays.toString(sortedArr));
        logger.info("耗时:" + (endDate.getTime() - startDate.getTime()));
    }

    private static int[] sort(int[] array){
        logger.info("排序开始...");
        //循环数组，保证右边的比左边的小
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            //当array[i] 大于 array[i - 1]的时候 两者换位置
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        logger.info("排序完成...");
        return array;
    }

}