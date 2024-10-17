package codility.leetcode;

import java.util.Arrays;

public class MergeSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i= 0 ; i < nums2.length ; i++) {
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);

    }

    public static void main(String[] args) {
        new MergeSortArray().merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }

}
