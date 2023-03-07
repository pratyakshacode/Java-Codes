public class Recursion1 {

    static void kMultiples(int n, int k){

        if(k == 0) return ;
        kMultiples(n, k-1);

        System.out.print(n * k + " ");
    }
    public static void main(String[] args) {
        
        //printing the n multiples of a number

        kMultiples(5, 10);
        
    }
}
