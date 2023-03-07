public class PrintSubsequences {

    public static void subsequenceSum(int [] arr, int index, int sum){

        if(index >= arr.length){

            System.out.println(sum);
            return;
        }

        // when including the element

        subsequenceSum(arr, index+1, sum+arr[index]);

        //when excluding the element 

        subsequenceSum(arr, index+1, sum);
    }
    public static void main(String[] args) {

        int [] arr = {2,4,5};
        
        subsequenceSum(arr, 0, 0);
    
    }
}
