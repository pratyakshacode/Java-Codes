import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GraphImplement {
    
    static class Graph <T>{

        HashMap<T , List<T>> map = new HashMap<>();

        public void addVertex(T u){
            map.put(u, new LinkedList<T>());
        }

        public void addEdge(T u, T v){

            if(map.get(u) == null){
                addVertex(u);
            }
            if(map.get(v) == null){
                addVertex(v);
            }

            map.get(u).add(v);
            map.get(v).add(u);
        }

        public void getAdjecency(){

            for(var key : map.keySet()){

                System.out.print(key + " -> ");

                for(var value : map.get(key)){
                    System.out.print(value + " ");
                }

                System.out.print("\n");

            }
        }

        public int getSize(){

            return map.size();
        }

    }

    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>();
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 1);
        
        graph.getAdjecency();
        System.out.println(graph.getSize());
    }
}
