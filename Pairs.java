import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Pairs {

    static class pair<F,S> {
        F first;
        S second;
        public pair(F first, S second){
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args) {
        List<pair<Integer, Integer>> list = new ArrayList<>();
        pair<Integer, Integer> p;
        Stack<Integer> stack = new Stack<>();
        stack.push(13);
        stack.push(12);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }


        

    }
}
