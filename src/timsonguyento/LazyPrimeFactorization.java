package timsonguyento;

public class LazyPrimeFactorization implements Runnable{
    private String name;
    public LazyPrimeFactorization (String name){
        this.name = name;
    }
    boolean checkSonguyento(int number){

        if (number<2){
            return false;
        }else {
            for (int i = 2; i<number; i++){
                if (number%i ==0){
                    return false;
                }
            }
        }
        return true;
    }
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
      for (int i = 0; i<200; i++){
          if (checkSonguyento(i) == true){
              System.out.print(i+ " ");
          }
      }
        long endTime = System.currentTimeMillis();
        System.out.println("số nguyên tố" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
