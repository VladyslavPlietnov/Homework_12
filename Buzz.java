public class Buzz implements Runnable{
    int i;
    public Buzz(int i){
        this.i = i;
    }
    public void run(){
       while(Main.count ==i) {
            if (buzz()) {
                System.out.println("Buzz");
                Main.count++;
            }

        }
    }
    public boolean buzz(){
        if(i%3!=0 && i%5==0){
            return true;
        }
        return false;
    }
}
