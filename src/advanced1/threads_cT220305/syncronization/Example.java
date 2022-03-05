package advanced1.threads_cT220305.syncronization;

public class Example {

    private int count = 0;

    public static void main(String[] args) {

        Example c = new Example();
        c.example();

    }

    public void example(){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++){
                    add();
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++){
                    subtract();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(count);
    }

    public synchronized void add(){
        count++;
    }

    public synchronized void subtract(){
        count--;
    }
}
