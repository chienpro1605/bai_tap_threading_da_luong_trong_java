package thuchanhtaoluongbangrunable;

public class Main {
    public static void main(String args[]) {
        System.out.println("Main thread running... ");

        RunableDemo runnableDemo1 = new RunableDemo("Thread-1-HR-Database");
        runnableDemo1.start();

        RunableDemo runnableDemo2 = new RunableDemo("Thread-2-Send-Email");
        runnableDemo2.start();

        System.out.println("Main thread stopped!!! ");
    }
}
