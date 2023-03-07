import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Queuechecking {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());      
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
        
        // set.add(12);
        
        map.put(12, 14);
        map.put(1,56);
        map.put(45,11);
        map.put(5,39);
        
        set.addAll(map.values());
        pq.add(12);
        pq.add(1);
        pq.add(45);
        pq.add(19);
        pq.add(4);

        while(!pq.isEmpty()){

            System.out.print(pq.poll() + " ");
        }
        System.out.println();
        System.out.println(map);
        System.out.println(set);

        
        StringBuffer str = new StringBuffer("MyString");
        str.reverse();
        String str2 = "Hello";
        str2.contains("ch");
        StringBuilder str3 = new StringBuilder("hello");
        String st = "bzmxvzjxfddcuznspdcbwiojiqf";
        System.out.println(st.contains("u"));


    }
}
