import java.util.*;
//poll--> used to remove the max and min value based on order .if collection order is in  reverse it removes the max value.
// Peek ---> used to print the max and min value based on order.if collection order is in reverse it print the max value.

public class PriorityQueueSample {
    public static void main(String[] args) {
       PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());

        //PriorityQueue<Integer> p = new PriorityQueue<>();



        p.add(3);
        p.add(10);
        p.add(7);
        p.add(2);
        System.out.println("Before using poll:"+ p );
        System.out.println(p.poll());
        System.out.println("After using poll:"+ p);
        System.out.println(p.peek());

    }


}
