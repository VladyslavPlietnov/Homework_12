public class InfiniteThread {
    public static void main(String[] args){
        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Минуло 5 секунд");
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                int count = 1;
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(count);
                    count++;
                }
            }
        };

        t1.start();
        t2.start();
    }
}
