import java.util.Scanner;

public class SwapMethod {

    public static void swap(int [] arr, int first, int second){
        
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }

    public static void selectionByMin(int[] arr){

        int n = arr.length;

        for(int i=0; i<n; i++){
            
            int minIndex = i;

            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]) minIndex = j;
            }

            if(minIndex != i)
            swap(arr, i, minIndex);
        }
    }

    public static void selectionByMax(int[] arr){

        int n = arr.length;

        for(int i=0; i<n; i++){
            int maxIndex = n - i - 1;
            int lastIndex = n - i - 1;

            for(int j=0; j<n-i; j++){
                if(arr[j] > arr[maxIndex]) maxIndex = j;
            }

            if(maxIndex != lastIndex){
                swap(arr, lastIndex, maxIndex);
            }
        }

    }

    public static void selectionByShifting(int [] arr){

        int n = arr.length;

        for(int i=0; i<n; i++){

            int minIndex = i;

            for(int j=i+1; j<n; j++){

                if(arr[j] < arr[minIndex]) minIndex = j;
            }

            int key = arr[minIndex];
            System.out.println(minIndex + " " + key);

            while(minIndex > 0){
                arr[minIndex] = arr[minIndex - 1];
                minIndex--;
            }

            arr[i] = key;
        }
    }

    public static void bubbleSort(int [] arr){

        int n = arr.length;
        boolean sorted = true;

        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(arr[j] > arr[j+1]) swap(arr, j, j+1);
                sorted = false;
            }

            if(sorted){
                break; //for making the best case to be O(n)
            }
        }

    }

    public static void inverseBubbleSort(int [] arr){

        int n = arr.length;

        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(arr[j] < arr[j+1]) swap(arr, j, j+1);
            }
        }
    }

    public static void insertionSort(int [] arr){

        int n = arr.length;

        for(int i=1; i<n; i++){

            int j = i-1;
            int element = arr[i];

            while(j >=0 && arr[j] > element){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = element;
        }
    }
    public static void main(String[] args) {
        int arr[] = {145,22,22,22,43,20,145,66};
        // selectionByMin(arr);
        // selectionByShifting(arr);
        // bubbleSort(arr);
        // inverseBubbleSort(arr);
        insertionSort(arr);

        for(var element : arr){
            System.out.print(element + " ");
        }
        
        // Scanner sc = new Scanner(System.in);
        

    }
}