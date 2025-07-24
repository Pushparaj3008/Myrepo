import java.util.*;
public class Threadvector {
       public static void main(String[] args) {
              Vector<String> f1 = new Vector<>();
              f1.add("Ronaldo");
              f1.add("Messi");
              f1.add("Neymar");
              System.out.println("Before Thread:"+f1);

       Thread t1 = new Thread(()->{
              f1.set(1,"Mbappe");

       });

       Thread t2 = new Thread(()->{
              f1.set(1,"Kaka");

       });

        t1.start();
        t2.start();

        try{
               t1.join();
               t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After Thread:"+ f1);

       }



}
