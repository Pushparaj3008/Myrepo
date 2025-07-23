public class StaticBlockExample {

    static int count;

    // Static block to initialize static variable
    static {
        count = 100;
        System.out.println("Static block executed: count initialized to " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        System.out.println("Count = " + count);
    }
}
