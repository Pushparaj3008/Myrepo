class Counter {
    int count = 0;

    public void increment() {
        count++; // Not atomic, leads to race condition
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(); // shared data

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.count);
    }
}
