import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Threading implements Runnable{
    static int count = 0;
    Lock lock = new ReentrantLock(); 

    public void run(){

        lock.lock();

        for(int i=0; i<10000; i++){
            count++;
        }
        lock.unlock();
    }
    public static void main(String ... args) throws InterruptedException {

        Threading obj = new Threading();

        Thread t = new Thread(obj);
        Thread t2 = new Thread(obj);

        t.start();
        t2.start();

        t.join();
        t2.join();


        System.out.println(count);
    }

}
