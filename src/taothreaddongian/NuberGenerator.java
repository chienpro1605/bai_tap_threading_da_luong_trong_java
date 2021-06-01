package taothreaddongian;

public class NuberGenerator implements Runnable{
    private String name;

    public NuberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
            for (int i = 0; i<10; i++){
                System.out.println("số tự nhiên:"+this.name +i+"hashcode là"+this.hashCode());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
