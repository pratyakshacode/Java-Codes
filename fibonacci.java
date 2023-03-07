import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacci {
   
    public static int fib(int n, List<Integer> list){

        if(n <= 1){
            return n;
        }

        if(list.get(n) != -1){
            return list.get(n);
        }

        list.set(n, fib(n-1, list) + fib(n-2, list));
        return list.get(n);
    }

    public static int fibByTab(int n){

        List<Integer> list = new ArrayList<>(n+1);

        for(int i=0; i<=n; i++){
            list.add(-1);
        }

        list.set(0,    0);
        list.set(1, 1);

        for(int i=2; i<=n; i++){
            list.set(i, list.get(i-1)+ list.get(i-2));
        }

        return list.get(n);
    }

    public static int OptimizedFib(int n){

        int prev_0 = 0;
        int prev_1 = 1;
        int curr;

        for(int i=2; i<=n; i++){

            curr = prev_0 + prev_1;
            prev_0 = prev_1;
            prev_1 = curr;
        }

        return prev_1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>(n+1);

        for(int i=0; i<n+1; i++){
            list.add(-1);
        }

        int ans = fib(n, list);

        int get = fibByTab(n);

        System.out.println(ans);
        System.out.println(get);
        System.out.println(OptimizedFib(n));
       
        
    }
}
