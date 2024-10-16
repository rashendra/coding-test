package codility.leetcode;

/**
 * This is the solution for Greedy algorithms > MaxNonoverlappingSegments
 * The problem is equivalent to the Activity Selection Problem,
 * where you have to choose the maximum non overlapping tasks.
 * <p>
 * This is marked as PAINLESS difficulty
 */

public class MaxNonOverlappingSegmentsRush {

    public int solution(int[] A, int[] B) {
        int lastSegmentIndex = -1 ;
        int nonOverlappingCount = 0;
        for (int i = 0; i< A.length ; i++) {
            if (A[i]> lastSegmentIndex) {
                nonOverlappingCount++;
                lastSegmentIndex = B[i];
            }
        }
        return  nonOverlappingCount;
    }

    public static void main(String[] args) {
        System.out.println(new MaxNonOverlappingSegmentsRush().solution(
                new int[]{1, 3, 7, 9, 9},
                new int[]{5, 6, 8, 9, 10}));
    }

}
