public class Numbers implements Runnable{
    int i;
    public Numbers(int i){
        this.i = i;
    }
    public void run(){
        if(numbers()){
            System.out.println(i);
        }

    }
    public boolean numbers(){
        if(i%3!=0 && i%5 !=0){
            return true;
        }
        return false;
    }
}
