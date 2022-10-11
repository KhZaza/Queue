package main;

import myQueue.MyQueue;

public class Mymain {
    public static void main(String[] args){
        MyQueue queue = new MyQueue(10);
        System.out.println(queue.enqueue(1000));
        System.out.println(queue.enqueue(5656));
        System.out.println(queue.enqueue(8965));
        System.out.println(queue.getSize());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue() + " is delete from the list");
        System.out.println(queue.getSize());



    }
}

//output
/*
true
true
true
3
1000
false
1000 is delete from the list
2

 */
