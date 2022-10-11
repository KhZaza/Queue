package myQueue;
//using an array

public class MyQueue {
    int[] queue;
    int rear;
    int front;
    int size; // total number of elements in queue

    //constructor to create a queue
    public MyQueue(int sizeOfArray){
        queue = new int[sizeOfArray];
        rear = -1;
        front = -1;
        size = 0;
    }

    //check if the queue is empty
    public boolean isEmpty(){
        boolean response = false;
        if (size == 0){
            response =true;

        }
        return response;
    }




    //add element to the queue, return true if the element is added
    public boolean enqueue(int element){
        boolean response =false;

        if(rear != queue.length -1){
            rear++;
            queue[rear] = element;
            size++;
            response =true;
        }
        return response;
    }


    //remove a number
    public int dequeue(){
        int responce =0;
        if (size != 0){
            front ++;
            responce = queue[front];
            size--;
        }
        return responce;
    }


    //get the front element
    public int peek(){
        int response = 0;
        if(!isEmpty()){
            response = queue[front +1];
        }
        return response;

    }
    //get the size
    public int getSize(){
        return size;
    }

}
