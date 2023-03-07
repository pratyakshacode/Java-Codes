public class SumOfSubset {

    public static boolean sumOfSubset(int [] arr, int sum, int index){


        if(index == 0){

            if(sum == 0) return true;
            else return false;
        }

        boolean include = false;

        if(arr[index] <= sum)
        include = sumOfSubset(arr, sum - arr[index] , index-1);

        boolean exclude = sumOfSubset(arr, sum, index-1);

        return include || exclude;
    }

    public static boolean withMemoization(int [] arr, int sum, int index, int [][] dp){

        if(index == 0) {
             if(sum == 0) return true;
            return false;
        }
            
        if(dp[index][sum] != -1) return true;
        boolean include = false;

        if(arr[index] <= sum)
        include = withMemoization(arr, sum - arr[index], index-1, dp);
        boolean exclude = withMemoization(arr, sum, index-1, dp);

        if(include || exclude) dp[index][sum] = 1;

        return dp[index][sum] != -1;

    }

    public static boolean withTabulation(int [] arr, int sum){

        boolean dp [][] = new boolean [arr.length][sum+1];

        //initializing the dp array

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                
                if(i == 0) dp[i][j] = false;
                if(j == 0) dp[i][j] = true;
            }
        }

        for(int i=1; i<arr.length; i++){
            for(int j=1; j<dp[0].length; j++){

                boolean include = false;
                if(arr[i] <= j)
                     include = dp[i-1][j] || dp[i-1][j - arr[i]];

                boolean exclude = false;
                exclude = dp[i-1][j];

                dp[i][j] = include || exclude;
            
            }
        }

            return dp[arr.length-1][sum];
        }

    
    public static void main(String[] args) {
        
        int arr [] = {2,3,4,8,10};
        int sum = 10;

        int [][] dp = new int [arr.length+1][sum+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        
       System.out.println(sumOfSubset(arr, sum, arr.length - 1));

       System.out.println(withMemoization(arr, sum, arr.length-1, dp));
        System.out.println(withTabulation(arr, sum));
    }
}
