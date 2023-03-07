import java.util.ArrayList;

public class SumSubset {

    static int [][] dp;

    public boolean subsetSum(int [] arr, int sum, int index){

        if(sum == 0) return true;
        if(index == 0){
            if(sum - arr[index] == 0) return true;
            else return false;
        }

        boolean include = false;
        if(arr[index] <= sum) include = subsetSum(arr, sum - arr[index], index - 1);
        boolean exclude = subsetSum(arr, sum, index - 1);

        return include || exclude;

    }

    public boolean subsetUsingMemoization(int [] arr, int sum , int index){

        if(sum == 0) return true;
        if(index == 0){
            if(sum - arr[index] == 0) return true;
            else return false;
        }

        if(dp[index][sum] != -1) return true;

        boolean include = false;
        if(arr[index] <= sum) include = subsetUsingMemoization(arr, sum - arr[index], index - 1);

        boolean exclude = subsetUsingMemoization(arr, sum, index - 1);

        if(include || exclude) dp[index][sum] = 0;
        return include || exclude;
    }

    boolean tabulation(int [] arr, int sum){

        boolean [][] dp = new boolean[arr.length + 1][sum + 1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i == 0) dp[i][j] = false;
                if(j == 0) dp[i][j] = true;
            }
        }

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){

                boolean include = false;
                if(arr[i-1] <= j) include = dp[i-1][j - arr[i-1]];
                boolean exclude = dp[i-1][j];

                dp[i][j] = include || exclude;
            }
        }

        return dp[arr.length][sum];
    }

    public int countSubset(int [] arr, int sum){

        int [][] dp = new int[arr.length + 1][sum + 1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i == 0) dp[i][j] = 0;
                if(j == 0) dp[i][j] = 1;
            }
        }

        for(int i=1; i<dp.length; i++)
            for(int j=1; j<dp[0].length; j++){

                if(arr[i-1] <= j) dp[i][j] = 1 + dp[i-1][j - arr[i-1]];
                else dp[i][j] = dp[i-1][j];
            }

            return dp[arr.length][sum];
    }
    public static void main(String[] args) {
        
        SumSubset s = new SumSubset();
        int [] arr = {1,2,3,5,7};
        int sum = 9;
        if(s.subsetSum(arr, sum, arr.length - 1)){
            System.out.println("Subset is present");
        } else System.out.println("Subset is not present");

        dp = new int[arr.length + 1][sum + 1];

        for(int i=0; i<dp.length; i++) 
            for(int j=0; j<dp[0].length; j++) 
                dp[i][j] = -1;

        System.out.println("Using Memoization : " + s.subsetUsingMemoization(arr, sum, arr.length - 1));
        System.out.println("Using Tabulation : " + s.tabulation(arr, sum));

       System.out.println("Count : " + s.countSubset(arr, sum));

    }
}
