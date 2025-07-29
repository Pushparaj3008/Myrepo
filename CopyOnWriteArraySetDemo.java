import java.util.Iterator;
import java.util.*;

public class CopyOnWriteArraySetDemo {

    static Set<RetailCustomer> cset = Collections.synchronizedSet(new HashSet<>());

    static {

        RetailCustomer rc1 = new RetailCustomer();
        rc1.setName("Vivek");

        RetailCustomer rc2 = new RetailCustomer();
        rc2.setName("Sara");

        cset.add(rc1);
        cset.add(rc2);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();



    }

}

class RetailCustomer{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}


class Thread1 extends Thread{
    public void run() {
        for(int index=0; index<100;index++) {
            try {
                this.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            RetailCustomer rc = new RetailCustomer();
            rc.setName("John");
            CopyOnWriteArraySetDemo.cset.add(rc);
        }
    }
}

class Thread2 extends Thread {
    public void run() {

        System.out.println("dd");


        try {
            this.sleep(1000);

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Synchronize block for iteration
        synchronized (CopyOnWriteArraySetDemo.cset) {
            Iterator<RetailCustomer> iter = CopyOnWriteArraySetDemo.cset.iterator();
            while (iter.hasNext()) {
                RetailCustomer rc = iter.next();
                System.out.println(rc.getName());
            }


        }
    }
}