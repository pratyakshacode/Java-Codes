import java.util.ArrayList;

public class RecurseString {

    static String removeChars(String s, int index){

        if(index == s.length()){
            return "";
        }

        if(s.charAt(index) != 'a'){
            return s.charAt(index) + removeChars(s, index+1);
        }

        else return removeChars(s, index+1);   
    }

    static String removeChars(String s){

        if(s.length() == 0) return s;

        if(s.charAt(0) != 'a'){
            return s.charAt(0) + removeChars(s.substring(1));
        }

        return removeChars(s.substring(1));
    }

    static String reverse(String s){

        if(s.length() == 0){
            return "";
        }

        return reverse(s.substring(1)) + s.charAt(0);

    }

    static ArrayList<String> stringSubsequences(String s){

        ArrayList<String> ans = new ArrayList<>();

        if(s.length() == 0){

            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        ArrayList<String> subList = stringSubsequences(s.substring(1));

        for(var element : subList){

            ans.add(element);
            ans.add(s.charAt(0) + element);
        }

        return ans;
    }

    
    static void printSubsequence(String s, int index, String output){

        if(index == s.length()){
            System.out.println(output);
            return;
        }

        // excluding the character from the string

        printSubsequence(s, index+1, output);

        //including the character in the output string

        char ch = s.charAt(index);

        printSubsequence(s, index+1, output+ ch);
    }

    static void printSubsetSum(int [] arr, int index, int sum){

        if(index == arr.length){
            System.out.println(sum);
            return;
        }

        //excluding the element from sum 

        printSubsetSum(arr, index+1, sum);

        //including the element into sum

        printSubsetSum(arr, index+1, sum+arr[index]);

    }
    public static void main(String[] args) {
        
        String s = "abcdax";
        String b = "dbcaxtaaap";


        System.out.println(removeChars(b)); 
        System.out.println(removeChars(s));
        System.out.println(reverse(b));

        ArrayList<String> ans = stringSubsequences("abc");

        System.out.println(ans);

        // printSubsequence("abc", 0, "");

        int [] arr = {2,4,5};
        printSubsetSum(arr, 0, 0);
    }
}
