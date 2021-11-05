package com.ds.array;


/**
 * @author rui.wang
 * @version 1.0
 * @description:
 * 动态数组
 * @date 2021/11/3 16:38
 */
public class ArrayDynamic<E> {
    public static void main(String[] args) {
        ArrayDynamic<Integer> arr = new ArrayDynamic();
        arr.add(1);
        System.out.println(arr.get(0));
    }

    //数组初始化
    private E[] data;
    //数组中有效元素的个数
    private int size;
    public ArrayDynamic(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public ArrayDynamic(){
       this(10);
    }

    public void add(E e){
       add(size,e);
    }


    public void addFirst(E e){
        add(0,e);
    }

    public void addLast(E e){
        add(size,e);
    }

    //第index位置插入元素
    public void add(int index,E e){
        if(getSize()==data.length){
            resize(2*data.length);
        }
        if(index<0 || index>size){
            throw new IllegalArgumentException(" index<0 || index>size ....");
        }

        for (int i = size-1; i > index; i--) {
            data[i+1]=data[i];
        }
        data[index] = e;
        size++;
    }

    private void resize(int newCapacity) {
        E[] newData = ( E[])new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }


    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if(data[i].equals(e)){
                return  true;
            }
        }
        return false;
    }

    public int find(E e){
        for (int i = 0; i < size; i++) {
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    public E remove(int index ){
        if(index <0 || index >= size) {
            throw new IllegalArgumentException("Remove failed...");
        }
        E res = data[index];
        for (int i = index+1; i < size; i++) {
            data[i-1] = data[i];
        }
        size--;
        data[size]=null;
        if(size == data.length/2){
            resize(data.length/2);
        }
        return res;
    }

    public void removeElement(E e){
        int index = find(e);
        if(index!=-1){
            remove(find(e));
        }
    }

    public E removeFirst(){
        return remove(0);
    }

    public void set(int index ,E e) {
        data[index] = e;
    }

    public int getSize(){
        return size;
    }

    public E get(int index) {
        return data[index];
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
