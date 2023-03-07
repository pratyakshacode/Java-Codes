class SinglyLinkedList {

    public static Node head;

    static class Node {
        public int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addNode(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;

    }

    public void addFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public int length() {

        if (head == null) {
            return 0;
        }
        Node curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;

    }

    public void addPos(int data, int pos) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            System.out.println("Node added to first position");
            return;
        }
        int count = 2;

        Node curr = head;

        while (count < pos) {
            curr = curr.next;
            count++;
        }

        if (count > length()) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;

    }

    // deletion from the list;

    public void delete() {
        if (head == null) {
            System.out.println("Nothing to delete");
            return;
        }

        Node curr = head;
        head = head.next;
        curr.next = null;
    }

    public void deleteEnd() {

        if (head == null) {
            System.out.println("Nothign to delete");
            return;
        }

        Node curr = head;

        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
    }

    public void deletePos(int pos) {

        int count = 0;

        Node curr = head;
        Node prev = null;

        while (count < pos) {
            prev = curr;
            curr = curr.next;
            count++;
        }

        prev.next = curr.next;
    }

    public void print() {

        if (head == null) {
            return;
        }

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println(curr);
    }

    public int search(int value) {

        if (head == null) {
            return -1;
        }

        Node curr = head;
        int count = 0;

        while (curr != null) {
            if (curr.data == value) {
                return count;
            }

            curr = curr.next;
            count++;
        }

        return -1;
    }
}

public class FindListMid extends SinglyLinkedList{

        //find the middle element of the list 

        public static int FindMid(){

            if(head == null){
                return -1;
            }

            if(head.next == null){
                return head.data;
            }

            Node slow = head;
            Node fast = head.next;

            while(fast.next != null){
                fast = fast.next;
                if(fast.next != null){
                    fast = fast.next;
                }

                slow = slow.next;
            }

            return slow.data;
        }

        public static Node reverse(){

            if(head == null) return null;
            

            if(head.next == null) return head;

            Node curr = head;
            Node prev = null;
            Node next = null;

            while(curr != null){

                next = curr.next;
                curr = prev;
                prev = curr;
                curr = next;
            }

            return prev;
        }

    public static void main(String... args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(10);
        list.addNode(12);
        list.addNode(33);
        list.addNode(27);
        list.addNode(30);
        list.addNode(55);
        list.addNode(75);
        list.addNode(100);
        list.addFront(1);
        // list.addFront(0);

        list.print();
        System.out.println(FindMid());

        System.out.println(reverse());

        
    }
}
