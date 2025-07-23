public class FinalMethodExample 

{
    
    // Final method that cannot be overridden
    public final void displayMessage(int a) {
    
        System.out.println("This is a final method.");
        System.out.println("Value of a: " + a);
    }

    public static void main(String[] args) {
        FinalMethodExample example = new FinalMethodExample();
        example.displayMessage(5);
    }
}

