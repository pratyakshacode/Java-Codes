public class ThreadClass extends Thread{

    public ThreadClass(String name){
        super(name);
    }

    public void run(){

        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName());

            try{
                Thread.sleep(500);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }

   public static void main(String...args){

        ThreadClass t = new ThreadClass("First");
        ThreadClass t2 = new ThreadClass("Second");
        t.start();
        t2.start();

        System.out.println("Main method");
   }
}