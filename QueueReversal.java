
@FunctionalInterface
interface Random{
    public void Hello(String name);
}

class Another {


}

public class QueueReversal{
    public static void main(String[] args) {
        
      Random r = (name) ->{
        System.out.println("this is the computer is ");
      };
      r.Hello("Pratyaksha");
    }
}