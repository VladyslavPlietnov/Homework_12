

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    System.out.println("Минуло 5 секунд");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        t1.start();

        for(int i =1; i<100; i++){
         Thread fizz = new Thread(new Fizz(i));
         Thread buzz = new Thread(new Buzz(i));
         Thread fizzBuzz = new Thread(new FizzBuzz(i));
         Thread numbers = new Thread(new Numbers(i));
            fizz.start();
            buzz.start();
            fizzBuzz.start();
            numbers.start();
        }

    }
}