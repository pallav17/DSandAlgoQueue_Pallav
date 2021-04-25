package com.company;

import java.util.Stack;

public class StackQueue {

    int top;

    Stack<Integer> st1 = new Stack();
    Stack<Integer> st2 = new Stack();

    public void Enqueue(int input) {


        st1.push(input);
    }

    public int Dequeue() {


       if(isEmpty())
            throw new IllegalStateException();

        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }

        }
            return st2.pop();



    }

    public boolean isEmpty()
    {
        if (st1.isEmpty() && st2.isEmpty())
            return true;

        return false;
    }

}
