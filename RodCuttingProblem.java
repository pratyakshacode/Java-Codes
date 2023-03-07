public class RodCuttingProblem {

    public static int rodCutting(int [] length,  int [] price , int len){

        int dp [][] = new int [length.length + 1][len + 1];
        int n = length.length;

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){

                if(i == 0) dp[i][j] = 0;
                if(j == 0) dp[i][j] = 0;
            }
        }

            for(int i=1; i<=n; i++){
                for(int j=1; j<=len; j++){

                    if(length[i-1] <= j){
                        dp[i][j] = Integer.max(price[i-1] + dp[i][j - length[i-1]], dp[i-1][j]);
                    }
                    else dp[i][j] = dp[i-1][j];

                }
            }
        
        return dp[length.length][len];
    }
    public static void main(String[] args) {
        
        String[] arr = new String [] {"hello"};
        System.out.println(arr[0]);

        int length [] = {1,2,3,4};
        int price [] = {2,7,6,12};

        System.out.println(rodCutting(length, price, 4));
    }
}
