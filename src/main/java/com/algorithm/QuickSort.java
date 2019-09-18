package com.algorithm;

import org.apache.log4j.Logger;

import java.util.Date;
import java.util.Random;

/**
 * @author: aqua
 * @create: 2019-09-17 13:10
 * @description 快速排序
 */
public class QuickSort {

    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(QuickSort.class);

    public static void main(String[] args) {
        int[] nums = new int[100000000];

        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100000000);
        }
        Date startDate = new Date();
        logger.info("排序开始...");
        quickSort(nums, 0, nums.length - 1);
        logger.info("排序完成...");
        Date endDate = new Date();
        logger.info("耗时:" + (endDate.getTime() - startDate.getTime()));
    }


    private static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            //生成一个随机数
            double random = Math.random();
            //在L至R位置随机选取一个数与最右边的数交换
            swap(arr, l + (int) (random * (r - l + 1)), r);
            //此数组长度永远为2,p[0]为等于区的左边界，p[1]为等于区的右边界
            int[] p = partition(arr, l, r);
            //将分出来的小于区重复上面的动作
            quickSort(arr, l, p[0] - 1);
            //将分出来的大于区重复上面的动作
            quickSort(arr, p[1] + 1, r);
        }

    }

    private static int[] partition(int[] arr, int l, int r) {
        //声明一个小于区的索引
        int less = l - 1;
        //声明一个大于区的索引
        int more = r;
        //声明一个起始索引指针
        int index = l;
        //划分原则：
        /*1 如果arr(index)<arr(r)
          1.1 拿index位置的数与小于区右边第一个数进行交换
          1.2 小于区向右扩大一位
          1.3 index索引向右移动一位
        2 如果arr(index)==arr(r)
          2.1 index索引向右移动一位
        3 如果arr(index)>arr(r)
          3.1 拿index位置的数与大于区左边第一个数进行交换
          3.2 大于区向左扩大一位
          3.3 index索引位置不动
          */
        while (index < more) {
            if (arr[index] < arr[r]) {
                //一行代码完成划分原则的1.1, 1.2, 1.3功能
                swap(arr, index++, ++less);
            } else if (arr[index] == arr[r]) {
                index++;
            } else {
                //一行代码完成划分原则的3.1, 3.2, 3.3功能
                swap(arr, index, --more);
            }
        }
        //如果index索引与more相遇，则退出循环，并且R位置数与more位置数交换
        swap(arr, more, r);
        //用来记录等于区的左边界和右边界对应的索引
        return new int[]{less + 1, more};
    }

    /**
     *   将数组中索引i和j的数进行交换
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}