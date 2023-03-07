class Stack{

    private int [] arr;
    private int top;

    public Stack(int size){
        arr = new int[size];
        top = -1;
    }

    public void push(int data){

        if(top >= arr.length - 1){
            System.out.println("Stack Overflow");
            return;
        }

        top ++;
        arr[top] = data;
    }

    public int pop(){

        if(top == -1){
        return -1;
        }
        int element = arr[top];
        arr[top] = -1;
        top--;

        return element;
    }

    public void peek(){
        if(top == -1){
            System.out.println("Stack Underflowed");
            return;
        }
        System.out.println(arr[top]);
    }

    public void print(){

        for(var element : arr){
            System.out.print(element + ' ');
        }
    }
}
public class StackImplement {

    
    public static void main(String[] args){

        Stack st = new Stack(5);
        st.push(12);
        st.push(16);
        st.push(19);
        st.push(20);
        st.push(0);
        st.push(16);
        
        st.peek();
        st.pop();
        st.peek();


    }
}
