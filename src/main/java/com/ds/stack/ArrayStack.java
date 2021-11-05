package com.ds.stack;

import com.ds.array.ArrayDynamic;
import com.ds.array.ArrayGeneric;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/11/3 19:03
 */
public class ArrayStack<E> implements Stack<E>{

    ArrayDynamic<E> array;

    public ArrayStack(int capacity){
        array = new ArrayDynamic<>(capacity);
    }

    public ArrayStack(){
        array = new ArrayDynamic<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        E e = array.remove(array.getSize() - 1);
        return e;
    }

    @Override
    public E peek() {
        return array.get(getSize()-1);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append("[");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if(i != array.getSize() -1){
                res.append(",");
            }
        }
        res.append("] top");
        return res.toString();
    }
}
