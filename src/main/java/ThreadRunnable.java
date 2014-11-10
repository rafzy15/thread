/**
 * Created by marcin on 11/7/14.
 */
public class ThreadRunnable implements Runnable {
    int counter;

    public void run() {
        for (int i = 0; i < 250; i++) {


            add();
            System.out.println("counter is " + counter);
        }


    }


    public void add() {
        System.out.println("currentThread " + Thread.currentThread().getName());

        counter++;

    }


}




