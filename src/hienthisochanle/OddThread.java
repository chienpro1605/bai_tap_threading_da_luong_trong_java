package hienthisochanle;

public class OddThread extends Thread{
    String name;
    OddThread (String name){
        this.name = name;
    }
    @Override
    public void run(){
        for (int i = 0; i<= 10; i++){
            if (i%2==1){
                System.out.println(this.name + i);
                try {
                    Thread.sleep(10);

                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
