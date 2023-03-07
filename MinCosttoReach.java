public class MinCosttoReach{
    
    public static int solve(int n){
        return n;
    }
    public static void main(String[] args) {
        
        int ans = Math.min(solve(4), solve(5));
        System.out.println(ans);
    }
}