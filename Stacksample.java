import java.util.Stack;

public class Stacksample {

    public static void main(String[] args) {
        Stack<String> s1 = new Stack<>();

        s1.push("A");
        s1.push("B");
        s1.push("C");
        s1.push("D");

        System.out.println(s1);
        System.out.println(s1.pop());//pop "D"
        System.out.println(s1.peek());// Print C
        System.out.println("final Stack:"+s1);




    }
}
