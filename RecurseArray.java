public class RecurseArray {

    static void recurse(int [] arr, int idx){

        if(idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        recurse(arr, idx + 1);

    }

    static int sum(int arr [] , int idx){

        if(idx == arr.length - 1) return arr[idx];
        return arr[idx] + sum(arr, idx + 1);

    }

    static int maximumElement(int arr [] , int index){

        if(index  == arr.length - 1){
            return arr[index];
        }

        return Integer.max(arr[index], maximumElement(arr, index+1));
    }

    static boolean myLinearSearch(int [] arr, int idx, int target){

        if(idx == arr.length) return false;
        return arr[idx] == target || myLinearSearch(arr, idx+1, target);

    }

    static int linearSearch(int [] arr, int index, int target){
        
        if(index == arr.length) return -1;
        if(arr[index] == target) return index;

        return linearSearch(arr, index+1, target);


    }

    static void reverse(int [] arr, int s, int e){

        if(s >= e) return;

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        reverse(arr, s+1, e-1);
    }

    static void backtracking(int [] arr, int index){

        if(index == arr.length) return;

        backtracking(arr, index+1);
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        
        int arr [] = {4,50,2,1,3,18};

        recurse(arr, 0);
        System.out.println();
        System.out.println(sum(arr, 0));
        System.out.println(maximumElement(arr, 0));
        System.out.println(linearSearch(arr, 0, 1));
        System.out.println(myLinearSearch(arr, 0, 1));
        reverse(arr, 0, arr.length-1);

        recurse(arr, 0);

        backtracking(arr, 0);
    }
}
