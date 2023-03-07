public class unboundedKnapsack {

    public static int noOfWays(int [] weight, int value [] , int index, int W){


        if(index == 0){
            if(weight[0] <= W) return value[0];
            else return 0;
        }

        //include 
        int include = 0;
        if(weight[index] <= W)
        include = value[index] + noOfWays(weight, value, index-1, W - weight[index]);

        int exclude = noOfWays(weight, value, index-1, W);

        int ans = Math.max(include, exclude);

        return ans;
    }

    public static int unboundedNoOfWays(int [] weight, int [] value, int index, int W){

        // if(W <= 0) return 0;
        if(index == 0){
            if(weight[0] <= W) return value[0];
            else return 0;
        }


        int include = 0;
        if(weight[index] <= W)
        include = value[index] + unboundedNoOfWays(weight, value, index, W - weight[index]);

        int exclude = unboundedNoOfWays(weight, value, index - 1, W);

        return Math.max(include, exclude);

    }

    public static int tabulationNoOfWays(int [] weight, int val [], int W){

        int [][] dp = new int [weight.length + 1][W+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){

                if(i == 0) dp[i][j] = 0;
                if(j == 0) dp[i][j] = 0;
            }
        }


        for(int i=1; i<=weight.length; i++){
            for(int j=1; j<=W; j++){

                if(weight[i-1] <= j){
                    dp[i][j] = Integer.max(val[i-1] + dp[i][j - weight[i-1]], dp[i-1][j]);
                }
                else dp[i][j] = dp[i-1][j];
            }
        }

        return dp[weight.length][W];

    }

    
    public static void main(String[]args){

        int weight [] = {1,3,4,5};
        int value[] = {3,4,5,6};

        System.out.println("Maximum profit will be : " + noOfWays(weight, value, weight.length -1 , 5));
        System.out.println("Maximum unbouded ways are : " + unboundedNoOfWays(weight, value, weight.length  -1, 5));
        System.out.println("Maximum ways by tabulation are : " + tabulationNoOfWays(weight, value, 5));
    }
}
