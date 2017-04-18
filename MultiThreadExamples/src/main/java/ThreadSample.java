/**
 * Created by ramazan on 18.04.2017.
 */
public class ThreadSample extends Thread {
    public static void main(String[] args) {
        ThreadSample threadSample=new ThreadSample();
        threadSample.start();
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
