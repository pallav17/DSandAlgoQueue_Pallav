package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*
        Queue<Integer> queue = new ArrayDeque<Integer>();
        {
            queue.add(10);
            queue.add(20);
            queue.add(30);
        }

        System.out.println(queue);

        reverseQueue(queue);
        System.out.println(queue);

        ArrayQueue aq = new ArrayQueue();

        aq.enqueue(6);
        aq.enqueue(7);
        aq.enqueue(8);
        aq.enqueue(9);
        aq.enqueue(10);


        aq.dequeue();



        aq.enqueue(11);

        System.out.println(Arrays.toString(aq.queueArray));*/



      StackQueue queue = new StackQueue();

        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);




        int number1 =queue.Dequeue();
        System.out.println(number1);

        int number2 =  queue.Dequeue();

        System.out.println(number2);

        int number3 = queue.Dequeue();
        System.out.println(number3);






    }
        public static void reverseQueue (Queue<Integer> queue)
        {
            Stack<Integer> temp = new Stack();


            while (!queue.isEmpty())
            {

                temp.push(queue.remove());
            }

            while (!temp.isEmpty())
            {
                queue.add(temp.pop());
            }



        }
    }

