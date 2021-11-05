package com.ds.array;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/11/3 16:38
 */
public class Array {
    public static void main(String[] args) {
        Array arr = new Array();
        arr.add(1);
        System.out.println(arr.get(0));
    }

    //数组初始化
    private int data[];
    //数组中有效元素的个数
    private int size;
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    public Array(){
       this(10);
    }

    public void add(int element){
        if(getSize()==data.length){
            throw new IllegalArgumentException(" out of index ");
        }
        data[size++] = element;
    }


    public void addFirst(int e){
        add(0,e);
    }

    public void addLast(int e){
        add(size,e);
    }

    //第index位置插入元素
    public void add(int index,int e){
        if(getSize()==data.length){
            throw new IllegalArgumentException(" out of index ");
        }
        if(index<0 || index>size){
            throw new IllegalArgumentException(" index<0 || index>size ");
        }

        for (int i = size-1; i > index; i--) {
            data[i+1]=data[i];
        }
        data[index] = e;
        size++;
    }

    public int find(int e){
        for (int i = 0; i < size; i++) {
            if(data[i]==e){
                return i;
            }
        }
        return -1;
    }

    public int remove(int index ){
        if(index <0 || index >= size) {
            throw new IllegalArgumentException("Remove failed...");
        }
        int res = data[index];
        for (int i = index+1; i < size; i++) {
            data[i-1] = data[i];
        }
        size--;
        return res;
    }

    public void removeElement(int e){
        int index = find(e);
        if(index!=-1){
            remove(find(e));
        }
    }

    public int removeFirst(){
        return remove(0);
    }

    public void set(int index ,int e) {
        data[index] = e;
    }

    public int getSize(){
        return size;
    }

    public int get(int index) {
        return data[index];
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
