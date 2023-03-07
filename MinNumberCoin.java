
public class MinNumberCoin {

    public static int findNum(int [] nums, int x){

        if(x == 0) return 0;
        if(x < 0) return Integer.MAX_VALUE;

        int mini = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            int ans = findNum(nums, x-nums[i]);

            if(ans != Integer.MAX_VALUE)
                mini = Integer.min(mini, 1+ans);
        }

        return mini;
    }
    
    public static int findByMemo(int[] nums, int x, int [] dp){

        if(x == 0) return 0;
        if( x < 0) return Integer.MAX_VALUE;

        if(dp[x] != -1) return dp[x];

        int mini = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            int ans = findByMemo(nums, x-nums[i], dp);
            
            if(ans != Integer.MAX_VALUE){
                mini = Integer.min(mini, 1+ans);
                dp[x] = mini;
            }
        }

        if(dp[x] != Integer.MAX_VALUE)
        return dp[x];

        return -1;
    }

    public static int solveByTabulation(int[]nums, int x){

        int dp[] = new int[x + 1];
        dp[0] = 0;
        for(int i=1; i<=x; i++){
            dp[i] = Integer.MAX_VALUE;
        }

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                // nu
            }
        }
        
        return -1;
    } 
    public static void main(String[] args) {
        
        int [] nums = {1,2,5};
        int x = 11;

        // int ans = findNum(nums, x);
        // if(ans != Integer.MAX_VALUE) System.out.println(ans);
        // else System.out.println(-1);

        int [] dp = new int[x + 1];

        for(int i=0; i<=x; i++)
            dp[i] = -1;  

    int ans = findByMemo(nums, x, dp);

    if(ans != Integer.MAX_VALUE) System.out.println(ans);
    else System.out.println(-1);



    
}
}