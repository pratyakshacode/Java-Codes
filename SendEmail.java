public class SendEmail {


    int findPivot(int [] arr){

        int s = 0, e = arr.length - 1, mid = s + (e-s)/2;

        while(s < e){

            if(arr[mid] >= arr[0]) s = mid + 1;
            else e = mid;

            mid = s + (e-s)/2;
        }

        return e;
    }

    int binarySearch(int [] arr, int s, int e, int target){

        if(s > e) return -1;

        int mid = s + (e - s)/2;

        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return binarySearch(arr, s, mid - 1, target);
        else return binarySearch(arr, mid + 1, e, target);

    }
    public static void main(String [] args){

        SendEmail mail = new SendEmail();

        int arr[] = {4,5,6,7,0,1,2};
        int arr [] = {1,2,3,4,5};

        int target = 2;
        int pivot = mail.findPivot(arr);
        if(target == arr[pivot]) System.out.println("Pivot is the element");
        else if(target > arr[pivot] && target > arr[arr.length - 1]) System.out.println("Element present at : " + mail.binarySearch(arr, 0, pivot, target));
        else System.out.println("Element present at : " + mail.binarySearch(arr, pivot+1, arr.length-1, target));
    }
}
