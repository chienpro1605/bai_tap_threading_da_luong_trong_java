package taothreaddongian;

public class MainDemso {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new NuberGenerator("thread1"));
        Thread thread2 = new Thread(new NuberGenerator("thread2"));
        thread1.start();
        thread2.start();
    }
}
