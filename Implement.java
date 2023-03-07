import java.util.ArrayList;
import java.util.LinkedList;


public class Implement {
    
    static class MyHashMap <K,V>{

        public class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        public int n; //the total no of nodes
        public int N; //the total no of buckets we will have
        LinkedList<Node> buckets[];
        private int thresholdValue = 2;

        @SuppressWarnings("unchecked")
        public MyHashMap(){

            this.N = 4;
            buckets = new LinkedList[N];

            for(int i=0; i<N; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        public int hashFunction(K key){

            int index = key.hashCode();
            index = Math.abs(index);

            return index % N;
        }   

        public int ListIndex(int bucketIndex, K key){

            LinkedList<Node> ll = buckets[bucketIndex];

            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        public void rehash(){

            LinkedList<Node> oldList[] = buckets;
            int newLength = 2 * N;
            buckets = new LinkedList[newLength];

            for(int i=0; i<newLength; i++){

                LinkedList<Node> ll = oldList[i];

                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key, V value){

            int bucketIndex = hashFunction(key);
            int listIndex = ListIndex(bucketIndex,  key);

            if(listIndex == -1){

                buckets[bucketIndex].add(new Node(key, value));
                n++;
            }
            else {
                Node node = buckets[bucketIndex].get(listIndex);
                node.value = value;
            }

            double lambda = (double)n/N;

            if(lambda > thresholdValue){
                rehash();
            }
        }

        public ArrayList<V> values(){
            ArrayList<V> list = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];

                for(var node : ll){
                    list.add(node.value);
                }
            }
            return list;
        }
        public V get(K key){
            int bucketIndex = hashFunction(key);
            int listIndex = ListIndex(bucketIndex, key);

            if(listIndex == -1){
                return null;
            }

            else {
                return buckets[bucketIndex].get(listIndex).value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> list = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){

                LinkedList<Node> ll = buckets[i];

                for(var node : ll){
                    list.add(node.key);
                }
            }
            return list;

            }


            public boolean containKey( K key){

                int bucketIndex = hashFunction(key);
                int listIndex = ListIndex(bucketIndex, key);

                if(listIndex == -1) return false;

                return true;

            }

            public V remove(K key){

                int bucketIndex = hashFunction(key);
                int listIndex = ListIndex(bucketIndex, key);

                if(listIndex == -1){
                    return null;
                }
                else {
                    Node node = buckets[bucketIndex].remove(listIndex);
                    return node.value;
                }

            }

            

    }
    public static void main(String[] args) {
        
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("India", 100);
        map.put("China", 0);
        map.put("Indonesia", 50);
        map.put("America", 95);
        System.out.println(map.get("China"));
        map.put("China", 10);
        System.out.println(map.get("China"));

        System.out.println(map.get("India"));
        System.out.println(map.get("Bhutan"));
        
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containKey("Indi"));
        System.out.println(map.remove("China"));
        
        System.out.println(map.get("China"));
        


    }
}
