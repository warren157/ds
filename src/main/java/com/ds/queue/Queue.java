package com.ds.queue;

/**
 * @author rui.wang
 * @version 1.0.0
 * @ClassName Queue.java
 * @Description TODO
 * @createTime 2021年11月04日 18:45:00
 */
public interface Queue <E>{
    void enqueue(E e);
    E dequeue();
    E getFront();
    int getSize();
    boolean isEmpty();
}
