import java.util.*;

public class TreeSample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Sorted TreeSet: " + numbers); // [10, 20, 30]
    }
}
