import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        Queue<Integer> p = new LinkedList<>();



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
