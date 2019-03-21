package leecode;

/**
 * 622 实现循环队列
 */
public class MyCircularQueue622 {

    private int[] array;
    private int front;//队头
    private int rear;//队尾
    private int size;


    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue622(int k) {
        array = new int[k + 1];
        front = 0;
        rear = 0;
        size = array.length;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        //检测队列是否满了
        if (front == (rear +1)%size){
            return false;
        } else {
            array[rear] = value;
            rear = (rear +1)%size;
            return true;
        }
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        //检测队列是否为空
        if (front == rear){
            return false;
        } else {
            front = (front +1)%size;
            return true;
        }
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (front == rear){
            return -1;
        } else {
            return array[front];
        }
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (front == rear){
            return -1;
        } else {
            return array[(rear + size -1) % size];
        }
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return front == rear;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return front == (rear + 1)%size;
    }
}
