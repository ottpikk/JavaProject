package advanced1.threads_cT220305.firstExample;

import java.util.Random;

public class Bread implements Runnable{

    String name;
    int time;
    Random r = new Random();

    public Bread(String name){
        this.name = name;
        time = r.nextInt(3000); // generate random number between 0-3000
    }

    public void run() {

        try {

            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);  // 1000ms = 1 sec
            System.out.printf("%s is done\n",name);


        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
