package com.ds.stack;

/**
 * @author rui.wang
 * @version 1.0.0
 * @ClassName Stack.java
 * @Description TODO
 * @createTime 2021年11月04日 17:10:00
 */
public interface Stack <E>{
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
