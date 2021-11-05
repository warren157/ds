package com.ds.list;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/11/5 17:25
 */
public class LinkedList<E> {

    private Node head;

    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    private class Node{
        public E data;
        public Node next;

        public Node(E e,Node next){
            this.data = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    //链表头添加元素
    public void addFirst(E e){
        head = new Node(e,head);;
        size++;
    }

    public void add(int index,E e){
        if(index <0 || index > size)
            throw new IllegalArgumentException("非法索引");



//        if(index == 0 )
//            addFirst(e);
//        else{
//            Node prev = head;
//            for (int i = 0; i < index-1; i++) {
//                prev = prev.next;
//            }
////            Node node = new Node(e);
////            node.next = prev.next;
////            prev.next = node;
//            prev.next = new Node(e, prev.next);
//            size++;
//        }
        Node dummyHead = new Node(null,head);
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
                prev = prev.next;
        }
        prev.next = new Node(e, prev.next);
        size++;
        head = dummyHead.next;

    }

    public  E get(int index){
        if(index <0 || index > size)
            throw new IllegalArgumentException("非法索引");
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size-1);
    }
    //更新
    public void set(int index,E e){
        if(index <0 || index > size)
            throw new IllegalArgumentException("非法索引");
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.data = e;
    }

    public boolean contains(E e){
        Node curr = head;
        while(curr!=null ){
             if(curr.data.equals(e)){
                 return true;
             }
             curr = curr.next;
        }
        return false;
    }

    public void addLast(E e){
        add(size,e);
    }

    public E removeFirst(){
       return  this.remove(0);
    }

    public E remove(int index){
        if(index <0 || index > size)
            throw new IllegalArgumentException("非法索引");
        Node dummyHead = new Node(null,head);
        Node prev = dummyHead;
        for(int i=0;i<index;i++){
            prev = prev.next;
        }
        Node delNode = prev.next;
        E e = delNode.data;
        prev.next = delNode.next;
        delNode.next = null;
        size--;
        head = dummyHead.next;
        return e;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(Node cur = head;cur != null ; cur = cur.next)
            res.append(cur +" ->");
        res.append("NULL");
        return res.toString();
    }
}
