import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> check =  new HashSet<>();
        String a = "Hello";
        String b = "Helll";

        for(int i=0; i<a.length(); i++){
            set.add(a.charAt(i));
            check.add(b.charAt(i));
        }

        Iterator<Character> it = set.iterator();

       while(it.hasNext()){
        char ch = (char)it.next();

        System.out.println(ch);
       }

       System.out.println(set.equals(check));
    }
}
