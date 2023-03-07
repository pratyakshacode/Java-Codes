import java.io.PrintStream;

public class SecondMax{
    public static void main(String[] args) {
        PrintStream out = System.out;

        int arr[] = {13,34,2,34,33,1};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            } else if(arr[i] > secondMax && arr[i] < firstMax){
                secondMax = arr[i];
            }
        }

        out.println(secondMax); 
 
    }
}