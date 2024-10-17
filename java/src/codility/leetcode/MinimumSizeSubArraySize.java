package codility.leetcode;

public class MinimumSizeSubArraySize {

    public int minSubArrayLen(int target, int[] nums) {
        int additionalIndex = 0;
        int globalMinNumberOfElements = Integer.MAX_VALUE;
        Boolean reachedMax = false;
        for (int i = 0; i< nums.length ; i++) {
            int localSum = 0;
            int localNumElements =0;
            // while local sum is less than or equal
            while(localSum <= target && (additionalIndex + i) <= nums.length -1 ) {
                localSum = localSum + nums[additionalIndex + i];
                additionalIndex++;// keep in increasing elements without increasing i.
                localNumElements++;
            }
            additionalIndex = 0;
            if (localNumElements <= globalMinNumberOfElements && localSum >= target) {
                globalMinNumberOfElements = localNumElements;
                reachedMax = true;
            }


        }
        return reachedMax ? globalMinNumberOfElements : 0;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumSizeSubArraySize().minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        System.out.println(new MinimumSizeSubArraySize().minSubArrayLen(4, new int[]{1,4,4}));
        System.out.println(new MinimumSizeSubArraySize().minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));

    }
}
