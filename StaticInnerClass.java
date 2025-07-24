public class StaticInnerClass {
    private String outerField = "Outer Field";

    public class InnerClass {
        public void display() {
            System.out.println("Accessing: " + outerField);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass outer = new StaticInnerClass();
        StaticInnerClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
    

