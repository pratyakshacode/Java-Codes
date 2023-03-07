

public class LongestCommonSubsequence {

    public void reverse(String s){

        int i=0, j= s.length()-1;

        while(i <= j){

            
        }
    }

    public int LCS(String x, String y, int m, int n){

        if(m == 0 || n == 0) return 0;

        if(x.charAt(m-1) == y.charAt(n-1)) return 1 +  LCS(x, y, m-1, n-1);
        else {
            return Integer.max(LCS(x, y, m-1, n) , LCS(x, y, m, n-1));
        }
    }

    public int LCSUsingMemoization(String x, String y, int m, int n, int [][] dp){

        if(m == 0 || n == 0) return 0;

        if(dp[m][n] != -1) return dp[m][n];

        if(x.charAt(m-1) == y.charAt(n-1)){

            dp[m][n] =  1 + LCSUsingMemoization(x, y, m-1, n-1, dp);
            return dp[m][n];
        }
        else {
            dp[m][n] = Integer.max(LCSUsingMemoization(x, y, m-1, n, dp), LCSUsingMemoization(x, y, m, n-1, dp));
            return dp[m][n];
        }
    }

    public int LCSUsingTabulation(String x, String y, int m, int n){

        int [][] dp = new int [m+1][n+1];

        //initialization
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
            }
        }

        //logic
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){

                if(x.charAt(i-1) == y.charAt(j-1)) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Integer.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[m][n];
    }

    public StringBuilder printLCS(String x, String y, int m, int n, String output){

        int [][] dp = new int [m+1][n+1];

        //initialization
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
            }
        }

        //logic
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){

                if(x.charAt(i-1) == y.charAt(j-1)) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Integer.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        //now having the lcs dp

        int i=m, j=n;
        String temp = "";

        while(i > 0 && j > 0){

            if(x.charAt(i-1) == y.charAt(j-1)) {
                temp += x.charAt(i-1);
                i--; j--;
            }

            else {
                if(dp[i-1][j] > dp[i][j-1]){
                    i--;
                }
                else j--;
            }
        }
        
        return new StringBuilder(temp).reverse();
        
        
    }
    public static void main(String[] args) {
        
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();

        String x = "abcd", y = "abdefxe";
        int m = x.length(), n = y.length();

        System.out.println("Using Recursion : "+lcs.LCS(x, y, m, n));

        int [][] dp = new int [m+1][n+1];

        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println("Using Memoization : " + lcs.LCSUsingMemoization(x, y, m, n, dp));
        System.out.println("Using Tabulation : " + lcs.LCSUsingTabulation(x, y, m, n));


        StringBuilder ans =  lcs.printLCS(x, y, m, n, y);
        System.out.println(ans);
    }
}
