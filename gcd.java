public class gcd {

    public static int findgcd(int n, int m){

        if(n == 0) return m;
        if(m == 0) return n;

        return findgcd(m, n%m);
    }
    public static void main(String[] args) {
        
        int [] arr = new int[5];

        // for(int i=0; i<5; i++){
        //     arr[i]++;
        //     arr[i]++;
        // }

        for(var element : arr){
            System.out.print(element + " ");
        }
    }
}
