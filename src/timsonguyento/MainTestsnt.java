package timsonguyento;

public class MainTestsnt {
    public static void main(String[] args) {
      Thread thread1 = new Thread(new LazyPrimeFactorization("luồng 1 này chạy hết"));
      Thread thread2 = new Thread(new LazyPrimeFactorization("luồng 2 này chạy hết"));

      thread1.start();
      thread2.start();
    }
}
