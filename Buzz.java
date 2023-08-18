public class Buzz implements Runnable{
    int i;
    public Buzz(int i){
        this.i = i;
    }
    public void run(){
        if(buzz()){
            System.out.println("Buzz");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean buzz(){
        if(i%3!=0 && i%5==0){
            return true;
        }
        return false;
    }
}
