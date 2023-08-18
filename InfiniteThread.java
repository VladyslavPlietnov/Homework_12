public class InfiniteThread {
    public static void main(String[] args){
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
    }
}
