package com.test.entity;

/**
 * @author: Lvlongxin
 * @description 二分搜索排序
 * @date: 2023/8/28 23:36
 */

public class BinarySearchSort {
    public static void main(String[] args){
        int[] arr = new int[]{3, 4, 234, 425, 36, 567, 5235, 523, 52, 11, 55};
        int target = 234;
        System.out.println("pppp");

    }
    private static void search(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            int i = arr[mid];
            if (i < target){
                left = mid + 1;
            } else if (i > target) {
                right = mid - 1;
            }
        }
        for(int i = 0; i < arr.length; i++){
            
        }
    }
}
