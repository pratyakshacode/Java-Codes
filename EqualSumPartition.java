
public class EqualSumPartition {

    public static boolean equalSumPartitionUtility(int [] arr , int sum, int index){


        if(index == 0){

            if(sum == 0) return true;
            else return false;
        }

        //include the element 
        boolean include = false;

        if(arr[index] <= sum)
            include = equalSumPartitionUtility(arr, sum - arr[index], index-1);

        //excluding the element 
        boolean exclude = false;
        exclude = equalSumPartitionUtility(arr, sum, index-1);


        return include || exclude;

    }

    public static boolean equalSumPartition(int [] arr){

        int sum = 0;

        for(int i=0; i<arr.length; i++){

            sum += arr[i];
        }

        if(sum % 2 != 0) return false;
        else return equalSumPartitionUtility(arr, sum / 2 , arr.length - 1);

    }

    public boolean withMemoization(int [] arr){

        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        if(sum % 2 == 0){
            sum = sum / 2;

            int [][] dp = new int[arr.length+1][sum + 1];

            for(int i=0; i<dp.length; i++){
                for(int j=0; j<dp[0].length; j++){
                    dp[i][j] = -1;
                }
            }
            
            return withMemoizationUtility(arr, dp, sum, arr.length - 1);
        }
        else return false;   
    }

    public boolean withMemoizationUtility(int [] arr, int [][] dp, int sum, int index){
        
        if( index==0){

            if(sum == 0) return true;
            else return false;
        }

        if(dp[index][sum] != -1) return true;

        //including 

        boolean include = false;
        if(arr[index] <= sum)
            include = withMemoizationUtility(arr, dp, sum - arr[index], index-1);
        boolean exclude = withMemoizationUtility(arr, dp, sum, index-1);

        if(include || exclude ) dp[index][sum] = 1;
        return include || exclude;

    }

    public static boolean withTabulationUtility(int [] arr, int sum){

        int n = arr.length;

        boolean dp[][] = new boolean [n][sum + 1];
        

        //initializing the dp array
        for(int i=0; i<n; i++){
            for(int j=0; j<=sum; j++){
                if(i == 0) dp[i][j] = false;
                if(j == 0) dp[i][j] = true;
            }
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<dp[0].length; j++){

                boolean include = false;
                if(arr[i] <= j){
                    include = dp[i-1][j - arr[i]];
                }

                boolean exclude = dp[i-1][j];

                dp[i][j] = include || exclude;
            }
        }

        return dp[n-1][sum];
    }

    public static boolean withTabulation(int [] arr){

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        if(sum % 2 == 0){
            sum = sum / 2;
            return withTabulationUtility(arr, sum);
        }
        return false;

    }
    public static void main(String[] args) {
        
        int arr[] = {1,3,5,7};
        System.out.println("With recursion : " + equalSumPartition(arr));

        EqualSumPartition eq = new EqualSumPartition();

        
        System.out.println("With Memoization : " + eq.withMemoization(arr));
        System.out.println("with Tabulation : " + withTabulation(arr));

 
    }
}
