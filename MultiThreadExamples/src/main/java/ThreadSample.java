/**
 * Created by ramazan on 18.04.2017.
 */
//extends Thread ile de kullanilabilir...
public class ThreadSample implements Runnable {
    public static void main(String[] args) {
        ThreadSample threadSample=new ThreadSample();
        threadSample.run();
        for (int i = 0; i < 10; i++) {
            System.out.println(" Main Method  "+ i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread Mehtod: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
