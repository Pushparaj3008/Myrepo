

public class ExceptionSample1 {
    public static void main(String[] args) {
        int a= 10;
        try{
            int d =a/0;
            System.out.println(d);
        } catch (ArithmeticException e) {
            System.out.println("arithmethic exception"+e.getMessage() );

        }
    }
}
