import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.Random;
import java.util.concurrent.FutureTask;


class MyCallable implements Callable{

    @Override
    public Object call() throws Exception {
        
        Random random = new Random();

        int num = random.nextInt(10);
        Thread.sleep(1000);

        return num;
    }
}

public class Practice {

    public static void main(String[]args) throws InterruptedException, ExecutionException{

        FutureTask [] future = new FutureTask[10];

        for(int i=0; i<10; i++){

            Callable call = new MyCallable();

            future[i] = new FutureTask<>(call);

            Thread th = new Thread(future[i]);
            th.start();

        }

        for(int j=0; j<10; j++){

            Object o = future[j].get();

            System.out.println("The random number generated is : " + o);
            
        }
    }
}

class C extends Practice {
    
}