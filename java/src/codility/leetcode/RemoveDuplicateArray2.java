package codility.leetcode;

public class RemoveDuplicateArray2 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int index = 1 ;
        int count = 1;
        for(int i = 1; i< nums.length ; i++){
            if (nums[i-1] == nums [i]){
                count++;
            } else  {
                count =1;
            }
            if (count <= 2) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicateArray2().removeDuplicates(new int[]{1,1,1,2,2,3}));
        System.out.println(new RemoveDuplicateArray2().removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }
}
