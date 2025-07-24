import java.util.ArrayList;
public class ThreadList {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("English");
        subjects.add("Tamil");
        subjects.add("Maths");
        subjects.add("Science");

        Thread t1 = new Thread(()->{
            subjects.set(2,"History");

        });
        Thread t2 = new Thread(()->{
            subjects.set(2,"Chemistry");

        });

        t1.start();
        t2.start();

        try{
            t1.join(1000);
            t2.join(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
         System.out.println("SUBJECTS LIST:"+ subjects);

    }
}
