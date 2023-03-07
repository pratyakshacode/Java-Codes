public class BinarySearchPractice{

    public static int binarySearch(int [] arr, int key){

        int s = 0;
        int e = arr.length -1 ;
        int mid = s + ( e-s ) / 2;

        while(s <= e){
            
            if(arr[mid] < key) s = mid + 1;
            else if( arr[mid] > key ) e = mid - 1;
            else return mid;

            mid = s + (e - s) / 2;
        }

        return -1;
    }

    public static int firstOcc(int [] arr, int element){

        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;
        int ans = -1;

        while(s <= e){

            if(arr[mid] == element){
                ans  = mid;
                e = mid - 1;
            }
            else if( arr[mid] < element) s = mid + 1;
            else e = mid - 1;

            mid = s + (e - s) / 2;
           
        }

        return ans;
    }

    public static int lastOcc(int[] arr, int key){

        int s = 0;
        int e = arr.length -1;
        int ans = -1;

        while(s <= e){

            int mid = s + (e - s) / 2;

            if(arr[mid] == key){
                ans = mid;
                s = mid + 1;
            }
            else if(arr[mid] < key){
                s = mid + 1;
            }
            else e = mid - 1;

        }

        return ans;

    }

    public static int peakElement(int[] arr){

        int s = 0;
        int e = arr.length - 1;
        int mid = 0;

        while(s < e){
            mid = s + (e - s) / 2;
            if(arr[mid] < arr[mid+1]) s = mid + 1;
            else e = mid;
        }

        return arr[e];
    }

    public static int findPivot(int [] arr){

        int s = 0;
        int e = arr.length - 1;
        int mid;

        while(s < e){

            mid = s + (e - s) / 2;

            if(arr[0] <= arr[mid]){
                s = mid + 1;
            }
            else e = mid;
        }

        return arr[e];
    }

    
    public static void main(String[] args) {
         
        int arr[] = {7,8,10,2,3,4,5};
        System.out.println(binarySearch(arr, 2));
        System.out.println(firstOcc(arr, 3));
        System.out.println(lastOcc(arr, 4));
        System.out.println(peakElement(arr));
        System.out.println(findPivot(arr));
    }   
}