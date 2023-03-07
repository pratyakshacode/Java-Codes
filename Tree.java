import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {

    int maxLen = Integer.MIN_VALUE, maxSum = Integer.MIN_VALUE;

    public static Node root;
    public static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void builtTree(){

        System.out.println("Enter the data for the root node : ");
        Scanner sc = new Scanner(System.in);
        
        Queue<Node> q = new LinkedList<>();
        int data = Integer.parseInt(sc.nextLine());

        root = new Node(data);
        q.add(root);
        
        while(!q.isEmpty()){

            Node frontNode = q.poll();

            System.out.print("Enter the data for the left Node of " + frontNode.data + " : ");
            int leftData = Integer.parseInt(sc.nextLine());
            
            if(leftData != -1){
                Node leftNode = new Node(leftData);
                frontNode.left = leftNode;
                q.add(leftNode);
            }

            System.out.print("Enter the data for the right Node of " + frontNode.data + " : ");
            int rightData = Integer.parseInt(sc.nextLine());

            if(rightData != -1){
                
                Node righNode = new Node(rightData);
                frontNode.right = righNode;
                q.add(righNode);
            }
        }

        sc.close();

    }

    public void maxKsum(Node root, int len, int currsum){

        if(root == null){
            if(len > maxLen){
                maxLen = len;
                maxSum = currsum;
            }

            return;
        }
        else if(len == maxLen){
            maxSum = Integer.max(maxSum, currsum);
        }

        maxKsum(root.left, len+1, currsum + root.data);
        maxKsum(root.right, len+1, currsum + root.data);
    }

    public void printTree(){

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){

            Node frontNode = q.poll();

            if(frontNode == null){
                System.out.println();
            }
            else {

            System.out.print(frontNode.data + " ");

            if(frontNode.left != null){
                q.add(frontNode.left);
            }
            if(frontNode.right != null){
                q.add(frontNode.right);
            }

            q.add(null);
        }
        }


    }

    public int kSumPath(Node root, int sum, int currSum, int count){

        if(root == null){
            if(currSum  == sum) return ++count;
            else return 0;
        }

        int left = kSumPath(root.left, sum, currSum + root.data, count);
        int right = kSumPath(root.right, sum, currSum + root.data, count);

        return left + right;
    }


    public static void main(String[] args) {
        
        Tree t = new Tree();
        t.builtTree();
        t.printTree();

        System.out.println("kSumPath: " + t.kSumPath(root, 6, 0, 0));
       t.maxKsum(root, 0, 0);
       System.out.println("root : " + t.maxSum);

    }
}
