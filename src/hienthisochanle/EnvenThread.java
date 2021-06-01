package hienthisochanle;

public class EnvenThread extends Thread{
    String name;
    EnvenThread (String name){
        this.name = name;
    }
    @Override
    public void run(){
        for (int i = 0; i<= 10; i++){
            if (i%2==0){
                System.out.println(this.name + i);
                try {
                    Thread.sleep(15);

                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
