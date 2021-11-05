package com.ds.list;

/**
 * @author rui.wang
 * @version 1.0
 * @description: TODO
 * @date 2021/11/5 18:45
 */
public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            list.addFirst(i);
//            System.out.println(list);
//        }
//        list.remove(0);
//        System.out.println(list);
//        LinkedListStack<Integer> stack = new LinkedListStack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);

        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if( i % 3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
