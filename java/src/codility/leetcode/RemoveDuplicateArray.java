package codility.leetcode;

public class RemoveDuplicateArray {

    public int removeDuplicates(int[] nums) {
        int index = 1 ;
        for(int i = 1; i< nums.length ; i++){
            if (nums[i-1] != nums [i]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicateArray().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4,7,9}));
    }
}
