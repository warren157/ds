package com.ds.queue;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/11/4 19:04
 */
public class LoopQueue<E> implements Queue<E>{

    private E[] data;
    private int front,tail,size;

    public LoopQueue(int capacity){
        data = (E[])new Object[capacity+1];
        front = 0;
        tail = 0;
        size = 0;
    }
    public LoopQueue(){
       this(10);
    }

    public int getCapacity(){
        return data.length - 1;
    }

    @Override
    public void enqueue(E e) {
        if((tail+1)%data.length == front){//说明队列满的
            resize(getCapacity()*2);
        }
        data[tail] = e;
        tail = ( tail+1 ) % data.length;
        size++;
    }

    private void resize(int newCapacity) {
        E[] newData = (E[])new Object[newCapacity+1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(i+front) % data.length];
        }
        data = newData;
        front=0;
        tail = size;
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            throw  new IllegalArgumentException("队列为空...");
        }
        E ret = data[front];
        data[front] = null;
        front = (front+1) % data.length;
        size--;
        if(size == getCapacity() / 4 && getCapacity()!=0){
            resize(getCapacity() / 2);
        }
        return ret;
    }

    @Override
    public E getFront() {
        if(isEmpty())
            throw  new IllegalArgumentException("队列为空...");
        return data[front];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }
}
