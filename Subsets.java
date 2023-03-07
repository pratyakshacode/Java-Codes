import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void random(String str, List<String> list, int index, String output){

        if(index >= str.length()){
            list.add(output);
            return;
        }

        char element = str.charAt(index);

        for(int i=0; i<str.length(); i++){
            random(str, list, index+1, output+element);

        }
    }
    public static void main(String[] args) {
        
        String a = "abcd";
        List<String> list = new ArrayList<>();
        random(a, list, 0, "");

        for(var element : list){
            System.out.println(element);
        }
    }
}

