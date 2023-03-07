import java.util.HashMap;
import java.util.Map;

public class Question {

    public boolean isPrime(int n){

        if(n < 2) return false;

        for(int i=2; i<n; i++){
            if(n % i == 0) return false;
        }

        return true;
    }

    public int [] solve(String [] arr){

        int [] chars = new int[26];
        int [] ans = new int[arr.length];

        for(int i=0; i<arr.length; i++){

            String s = arr[i];
            int count = 0;

            for(int j=0; j<s.length(); j+=2){
                if(chars[s.charAt(j) - 'a'] == 0){
                    count ++;
                    chars[s.charAt(j) - 'a']++;
                }

                if(isPrime(count)) ans[i] = 1;
                else ans[i] = 0;
                
            }
        }

        return ans;

    }

    public int pocketsRequired(int [] arr){

        Map<Integer, Integer> map = new HashMap<>();
        int pockets = 1;

        for(int i=0; i<arr.length; i++){

            if(map.getOrDefault(arr[i], 0) < pockets){
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
                pockets++;
            }
            
        }
        return pockets;
    }

    
    public static void main(String[] args) {
        
        Question q = new Question();
        // String [] arr = {"abcdef", "pqrs", "xyzuvabb", "aaaaa"};
        // int [] ans = q.solve(arr);

        // for(var element : ans){
        //     System.out.print(element + " ");
        // }
        int [] arr = {3,3,4,5,6,8,8,8,8,8};
        System.out.print("Pockets required are : " + q.pocketsRequired(arr));

    }
}
