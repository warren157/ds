package com.ds.array;

import java.util.Arrays;

/**
 * @author rui.wang
 * @version 1.0
 * @description:
 * 数组基础
 *  1、快速查询
 *  2、最好应用于索引有语义的情况
 *  3、并非所有有语义的索引都适应于数组
 *      1、身份证号，比较大的数组
 * @date 2021/11/3 16:21
 */
public class Main {
    public static void main(String[] args) {

        ArrayGeneric<Integer> arr = new ArrayGeneric();
        arr.add(1);
        System.out.println(arr.get(0));
    }
}
