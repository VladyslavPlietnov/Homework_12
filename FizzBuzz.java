public class FizzBuzz implements Runnable{
    int i;
    public FizzBuzz(int i){
        this.i = i;
    }
    public void run(){
        if(fizzBuzz()){
            System.out.println("FizzBuzz");
        }

    }
    public boolean fizzBuzz(){
        if(i%3==0 && i%5 ==0){
            return true;
        }
        return false;
    }
}
