public class LongestSubstring {

    public int longestSubstring(String x,  String y){

        int m = x.length(), n = y.length();
        int [][] dp = new int [m+1][n+1];


        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
            }
        }

        int res = 0;

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){

                if(x.charAt(i-1) == y.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                
                res = Integer.max(dp[i][j], res);
                }
                else dp[i][j] = 0;
                
            }
        }

        return res;

    }

    public StringBuilder printLongestSubstring(String x, String y){

        int m = x.length(), n = y.length();

        int [][] dp = new int [m+1][n+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
            }
        }

        int res = 0, h = 0, v = 0;

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){

                if(x.charAt(i-1) == y.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];

                    if(dp[i][j] > res){

                        res = dp[i][j];
                        h = i;
                        v = j;
                    }
                }
                else { 
                    dp[i][j] = 0;
                }
            }
        }

        //now i am having the lcs dp 
        String ans = "";
        while(h > 0 && v > 0){

            if(dp[h][v] != 0 )
                ans += x.charAt(h-1);
            h--; v--;
            
        }
        
        return new StringBuilder(ans).reverse();
    }
    public static void main(String[] args) {
        
        LongestSubstring ls = new LongestSubstring();
        String x = "abcdxyzmnopqrst";
        String y = "xyzabcdmnopqrshhh";

        System.out.println("Length of longest common Substring is : " + ls.longestSubstring(x, y));
        System.out.println("ls is : " + ls.printLongestSubstring(x, y));
    }
}
