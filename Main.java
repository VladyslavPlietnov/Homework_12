

public class Main {
    static volatile int count =1;
    public static void main(String[] args) throws InterruptedException {



        for(int i =1; i<101; i++){

         Thread fizz = new Thread(new Fizz(i));
         Thread buzz = new Thread(new Buzz(i));
         Thread fizzBuzz = new Thread(new FizzBuzz(i));
         Thread numbers = new Thread(new Numbers(i));
            fizz.start();
            buzz.start();
            fizzBuzz.start();
            numbers.start();
            fizz.join();
            buzz.join();
            fizzBuzz.join();
            numbers.join();
        }

    }
}