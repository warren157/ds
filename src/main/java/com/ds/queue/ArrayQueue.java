package com.ds.queue;

import com.ds.array.ArrayDynamic;

/**
 * @author rui.wang
 * @version 1.0
 * @description:
 * 队列：先进先出
 * @date 2021/11/4 18:41
 */
public class ArrayQueue<E> implements Queue<E> {
    private ArrayDynamic<E> array;

    public ArrayQueue(int capacity){
        array = new ArrayDynamic<>(capacity);
    }

    public ArrayQueue(){
        array = new ArrayDynamic<>();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return null;
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }
}
