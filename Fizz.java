public class Fizz implements Runnable{
    int i;
    public Fizz(int i){
        this.i = i;
    }
    public void run(){
       if(fizz()) {
            System.out.println("Fizz");
        }

    }
   public boolean fizz(){
        if(i%3==0 && i%5!=0){
            return true;
        }
        return false;
   }
}
