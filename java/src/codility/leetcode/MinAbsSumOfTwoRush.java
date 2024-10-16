package codility.leetcode;

import java.util.Arrays;

/**
 * This is the solution for Caterpillar method > MinAbsSumOfTwo
 *
 * This is marked as RESPECTABLE difficulty
 */

public class MinAbsSumOfTwoRush {
    public int solution(int[] A) {
        int minAbsSumOfTwoTwo = Integer.MAX_VALUE;
        Arrays.sort(A); // This is a must so the negative values will be in the 1st part of the array.
        int head = 0;
        int tail = A.length -1 ;
        while (head <= tail) {
            // get the sum of minAbsSumOfTwoTwo and Math.abs(A[head] + A[tail]
            minAbsSumOfTwoTwo = Math.min(minAbsSumOfTwoTwo, Math.abs(A[head]+ A[tail]));
            if (A[head]+ A[tail] < 0) {
                // In this case the head is bigger, so we move forward.
                head++ ;
            } else {
                // In this case the A[head]+ A[tail] > 0 means the tails is bigger than the head.
                // as far as its bigger we reduce
                tail--;
            }
        }
        return minAbsSumOfTwoTwo;

    }

    public static void main(String[] args) {
        System.out.println(new MinAbsSumOfTwoRush().solution(new int[]{-7, 3, -1, 5, -11, 4, -9, 14, 17, -2})); //1
        System.out.println(new MinAbsSumOfTwoRush().solution(new int[]{8, 3, 5, 16, 11})); //6
        System.out.println(new MinAbsSumOfTwoRush().solution(new int[]{-7, -5, -6, -2, -9})); //4
        System.out.println(new MinAbsSumOfTwoRush().solution(new int[]{-7, 3, -6, 1, 0, -9})); //0
        System.out.println(new MinAbsSumOfTwoRush().solution(new int[]{-22, 3, 4, 5})); //6
    }

}
