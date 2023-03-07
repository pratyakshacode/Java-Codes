import java.util.Scanner;

//I trust on Recursion

public class Recursion {

    static Node head;
    public static int sum(int n){

        if(n == 1) return 1;

        int sum = sum(n-1) + n;
        return sum;
    }

    public static int factorial(int n){

        if(n == 0 || n == 1) return n;

        int ans = factorial(n-1) * n;

        return ans;
    }

    public static void printNums(int n){

        if(n == 0) return ;

        printNums(n-1);
        System.out.print(n + " ");

    }

    public static boolean palindrome(String str, int s, int e){


        //base case
        if( s >= e) return true; 

        //self work
        if(str.charAt(s) != str.charAt(e)) return false;
        //now recursion will handle

        return palindrome(str, s+1, e-1);
        

    }

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void insertNode(int data){

        if(head == null){ 
            head = new Node(data);
        return;
    }

    Node curr = new Node(data);
    curr.next = head;
    head = curr;
    }
    public static void main(String[] args) {
        
        int n = 5;

        System.out.println(sum(n));
        System.out.println(factorial(n));
        printNums(n);
        String palinString = "aabggfbaa";

        System.out.println(palindrome(palinString, 0, palinString.length()-1));

        Recursion r = new Recursion();
        
        head = new Node(12);
        
       insertNode(12);
       insertNode(13);
       insertNode(14);
       insertNode(15);

       Node ptr = head;

       System.out.println(head.data);

       while(ptr.next != null){
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
       }
    }
}
