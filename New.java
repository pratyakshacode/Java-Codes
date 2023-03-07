public class New {
    public static void main(String[] args) {
        
        int first = -1, second= -1;

        int arr [] = {2,2,1};
        for(int i=0; i<arr.length; i++){

            if(arr[i] > first){
                second = first;
                first = arr[i];
            } else if( arr[i] <= first && arr[i] >= second){
                second = arr[i];
            }
        }

        System.out.println(first + " " + second);

    }
}
