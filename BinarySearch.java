public class BinarySearch {

    public static int binarySearch(int [] arr, int target){

        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;
        int ans = -1;

        while( s <= e){

            if(arr[mid] == target){
                 ans =  mid;
                 System.out.println("in");
                 e = mid - 1;
            }
            else if(arr[mid] > target) e = mid - 1;
            else s = mid + 1;

            mid = s + (e-s) / 2;
        }

        return ans;

    }
    public static void main(String[] args) {
       
    }
}
