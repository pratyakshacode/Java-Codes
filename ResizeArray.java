public class ResizeArray {

    public static int[]  resize(int [] arr, int capacity){

        int temp [] = new int[capacity];
        
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }

        return temp;

    }
    public static void main(String[] args) {
        
        int arr[] = new int[4];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        // arr[4] = 4;
        arr = resize(arr, 10);
        arr[4] = 10;

        for(var element : arr){
            System.out.println(element);
        }

        System.out.println(arr.length);

    }
}
