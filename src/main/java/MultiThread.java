/**
 * Created by marcin on 11/7/14.
 */
public class MultiThread {
    public static void main(String args[]) {


        Runnable runnable = new ThreadRunnable();

        Thread count1 = new Thread(runnable);
        Thread count2 = new Thread(runnable);

        Thread count3 = new Thread(runnable);
        Thread count4 = new Thread(runnable);

        count1.start();
        count2.start();
        count3.start();
        count4.start();


        System.out.println("MAIN first");


    }

}
