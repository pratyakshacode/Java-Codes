import java.util.ArrayList;
import java.util.List;

public class StringGame {

    public static void solve(String str, String [] mapping, String output, int index, List<String> list){

        if(index >= str.length()){
            list.add(output);
            return;
        }

        int num = str.charAt(index) - '0';
        String val = mapping[num];

        for(int i=0; i<val.length(); i++){
            output = output + val.charAt(index);
            solve(str, mapping, output + val.charAt(i), index + 1, list);
            output = output.substring(0, output.length() -2);
        }
    }
    public static void main(String[] args) {
        
        String str = "23";
        String [] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> list = new ArrayList<>();

        solve(str, mapping , "", 0, list);

        System.out.println(list);
    }
}
