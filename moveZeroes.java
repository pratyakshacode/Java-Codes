import java.io.PrintStream;

public class moveZeroes {
    public static void main(String[] args) {
        PrintStream out = System.out;

        int arr[] = {0,0,8,1,2,1,3};
        int j = 0;

        //to move to the left simply reverse the loop

        for(int i=0; i<arr.length; i++){

          if(arr[i] != 0 && arr[j] == 0){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
          if(arr[j] != 0){
            j++;
          }
          
        }


        for(var element : arr){
            out.print(element + " ");
        }

    }
}
