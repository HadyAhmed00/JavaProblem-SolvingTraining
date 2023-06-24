package Jun.Day24;

public class BinarySearch {

    public static int search(int[] nums, int target) {

        if(nums.length==1 && target==nums[0]) {
            return 0;
        }else if(nums.length==1 ){
            return -1;
        }

        int start = 0;
        int end = nums.length;
        int mid = (end - start)/2;
//        int mid= (nums.length%2==0)? nums[nums.length/2]: nums[(nums.length-1)/2];

        while (end-start>0){
            if(end - start <=2){
                if(nums[start+1]== target){
                    return start+1;
                }else{
                    if(nums[mid]==target){
                        return mid;
                    }else if(nums[start]==target){
                        return start;
                    }else{
                        break;
                    }
                }
            }

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]>target){
                end  = mid;
                mid = ((end +start)/2);
            }else{
                start = mid;
                mid = ((end+start)/2);
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[]  arr = new int[]{-1,0,3,5,9,12};
        int tar = 9;
        System.out.print(String.valueOf(search(arr,tar)));
    }
}
