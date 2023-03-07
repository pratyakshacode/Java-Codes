import java.util.concurrent.Semaphore;

public class ConditionSemaphores implements Runnable{

    Semaphore sem = new Semaphore(3);


    public void run(){

        try{
        sem.acquire();
        for(int i=0; i<5; i++){
            System.out.println("Executing : " + Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        } catch(Exception e){
            e.printStackTrace();
        }

        

        sem.release();
    }

    public static void main(String[] args) throws InterruptedException{
        
        Thread t = new Thread(new ConditionSemaphores());
        Thread t2 = new Thread(new ConditionSemaphores());
        Thread t3 = new Thread(new ConditionSemaphores());
        Thread t4 = new Thread(new ConditionSemaphores());
        Thread t5 = new Thread(new ConditionSemaphores());

        t.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");
        t4.setName("Thread4");
        t5.setName("Thread5");

        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t.join();
        t2.join();

        System.out.println("Exiting main Function ");
    }
}
