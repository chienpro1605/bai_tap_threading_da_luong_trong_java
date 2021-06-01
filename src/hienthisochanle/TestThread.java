package hienthisochanle;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new OddThread("số lẻ:"));
        Thread thread2 = new Thread(new EnvenThread("số chẵn:"));
        thread1.start();
        thread1.join();
        thread2.start();
    }
}
