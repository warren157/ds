package com.ds.stack;

/**
 * @author rui.wang
 * @version 1.0
 * @description:
 * 栈也是一种线性结构
 * 相比数组，栈对应的操作是数组的子集
 * 只能从一端添加元素，也只能从一端取数据
 *
 * @date 2021/11/3 19:01
 */
public class Main {

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
