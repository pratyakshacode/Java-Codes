public class gcdJava {

    public static int iGCD(int x, int y){

        while(x % y != 0){

            int rem = x % y;
            x = y;
            y = rem;
        }

        return y;
    }

    public static int iterateGCD(int x, int y){

        int ans = 0;
        int min = Integer.min(x, y);

        for(int i = min; i>=1; i--){

            if(x % i == 0 && y % i == 0){
                ans = i;
                break;
            }
        }

        return ans;
    }

    public static int minusGCD(int x, int y){

        if(x == 0) return y;
        if(y == 0) return x;

        if(x > y) x = x - y;
        else y = y - x;

        return minusGCD(x, y);
    }


    public static int recGCD(int x, int y){

        if(y == 0) return x;
        else return recGCD(y, x%y);
    }
    
    public static void main(String[] args) {
        
        System.out.println(iGCD(24,32));
        System.out.println(iterateGCD(54, 33));
        System.out.println(recGCD(24, 32));
        System.out.println(minusGCD(54, 56));
    }
}
