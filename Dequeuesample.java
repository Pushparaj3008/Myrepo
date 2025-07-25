import java.util.*;
/* addFirst  ---> Add  the element at front
    addLast  ---> Add the element at Rear
    OfferFirst --> add the element at head of the front
      offerLast --> add the element at tail of the rear
      removeFirst and removeLast  --> remove the head and tail of deque
      peekFirst and peekLast  -->    Print the head and tail element of deque */

public class Dequeuesample {
    public static void main(String[] args) {
        Deque<String>   d1 = new ArrayDeque<>();
        d1.addFirst("A");
        d1.addLast("B");
        d1.offerFirst("c");
        d1.offerLast("D");
        d1.offerLast("F");
        d1.offerFirst("E");

        System.out.println(d1);
        System.out.println(d1.removeFirst());
        System.out.println(d1.removeLast());
        System.out.println(d1.peekFirst());
        System.out.println(d1.peekLast());




    }
}
