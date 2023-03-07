import java.util.ArrayList;
import java.util.List;

public class Ranges {
    public static List<String> summaryRanges(int[] nums) {
        
        List<String> list = new ArrayList<>();
        int i=0, j=0;

        while(i < nums.length){

            String str = "";
            j = i;
            
            while(j+1 < nums.length && nums[j+1] == nums[j] + 1){
                j++;
            }

            if(j-i > 0){
                str = str + nums[i] + "->" + nums[j];
            }
            else str = str + nums[i];
            
            list.add(str);
            i = j+1;
        }


        return list;
    }

    public static void main(String[] args) {
        int arr[] = {0,2,3,4,6,8,9};
        List<String> ans = summaryRanges(arr);
        System.out.println(ans);    
        var str = String.valueOf(arr[5]);

        System.out.println(str.getClass());
        System.out.println(String.valueOf(arr[3]));
    }
}
