package com.test.entity;

/**
 * @author: Lvlongxin
 * @description 冒泡排序
 * @date: 2023/8/28 23:18
 */
import java.util.Arrays;
public class MaoPao {
    public static void main(String[] args){
        int[] array = new int[]{3, 46, 434, 422, 63, 345, 353, 3, 1023, 0};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    private static void sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            boolean flag = false;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }
}
