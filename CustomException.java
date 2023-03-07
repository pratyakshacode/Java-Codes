import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws MyException{
        
        Scanner sc = new Scanner(System.in);
        MyException e = new MyException("age is less than 18");
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        sc.close();

        


        
    }

    
}

class MyException extends Exception{

    public MyException(String msg){
        super(msg);
    }
}
