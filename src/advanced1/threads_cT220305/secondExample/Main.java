package advanced1.threads_cT220305.secondExample;

public class Main {
    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();
        MyThread thread = new MyThread();

        //Creating Thread objects
        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        //This try-catch block makes wait til t1 and t2 are completed
        try {
            t1.join();
            t2.join();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("All done");

    }
}
