package com.company;

public class ArrayQueue {

    int queueArray[] = new int[5];

     //[0,0,0,0,0]

    int Front,Rear;
    int count;

    public void enqueue(int input) {
        if (count == queueArray.length) {
            throw new IllegalStateException();

        } else {
            queueArray[Rear] = input;
            Rear = (Rear+1)%queueArray.length;
            count++;
        }

    }

    public int[] dequeue()
    {
        if (queueArray[queueArray.length-1] == 0) {

            throw new IllegalStateException();
        }

        queueArray[Front] = 0;
        Front = (Front+1)%queueArray.length;
        count--;
        return queueArray;
    }


}
