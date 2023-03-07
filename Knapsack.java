public class Knapsack {

    static int [][] dp ;
    public int knapsack(int [] weight, int [] value, int W, int index){

        if(index == 0){
            if(weight[0] <= W) return value[0];
            else return 0;
        }

        int include = 0;
        if(weight[index] <= W) include = value[index] + knapsack(weight, value, W - weight[index], index - 1);
        int exclude = knapsack(weight, value, W, index - 1);

        return Integer.max(include, exclude);
    }

    public int knapsackUsingMemoization(int [] weight, int [] value, int index, int W){

        if(index == 0) {
            if(weight[0] <= W) return value[0];
            else return 0;
        }

        if(dp[index][W] != -1) return dp[index][W];

        int include = 0;
        if(weight[index] <= W) include = value[index] + knapsackUsingMemoization(weight, value, index-1, W - weight[index]);

        int exclude = knapsackUsingMemoization(weight, value, index-1, W);

        dp[index][W] = Integer.max(include, exclude);
        return dp[index][W];
    
    }

    public int knapsackUsingTabulation(int [] weight, int [] value, int W){

        int [][] dp = new int [weight.length+1][W + 1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
                else {

                    int include = 0;
                    if(weight[i-1] <= j){
                        include = value[i-1] + dp[i-1][j - weight[i-1]];
                    }
                    int exclude = dp[i-1][j];

                    dp[i][j] = Integer.max(include, exclude);
                }
            }
        }

        return dp[weight.length][W];
    }
    public static void main(String[] args) {
        
        Knapsack kn = new Knapsack();
        int [] weight = {3,4,7,6};
        int [] value = {15,7,60,51};
        int W = 10;

        dp = new int[weight.length][W+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(kn.knapsack(weight, value, W, weight.length - 1));
        System.out.println(kn.knapsackUsingMemoization(weight, value, weight.length -1 , W));
        System.out.println(kn.knapsackUsingTabulation(weight, value, W));

        
    }
}
