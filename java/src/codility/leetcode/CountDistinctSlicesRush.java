package codility.leetcode;

import java.util.Arrays;

/**
 * This is the solution for Caterpillar method > CountDistinctSlices
 *
 * This is marked as PAINLESS difficulty
 * M = 5 ,
 */


public class CountDistinctSlicesRush {
    public int solution(int M, int[] A) {
        int totalSlices = 0;
        boolean[] elements = new boolean[M+1]; // not sure why we need to have M + 1
        Arrays.fill(elements, false);
        int head = 0;

        for (int tail = 0; tail < A.length ; tail++) {
            while (head< A.length && !elements[A[head]]) {
                elements[A[head]] = true;
                totalSlices = totalSlices + (head - tail) + 1;
                head++;// move to the next head position.
                if (totalSlices > 1000000000) {// just the codility condition.
                    return -1;
                }
            }
            elements[A[tail]] = false;
        }
        return totalSlices;

    }

    public static void main(String[] args) {
        System.out.println(new CountDistinctSlicesRush().solution(9, new int[]{2, 4, 1, 7, 4, 9, 7, 3, 5, 5, 8, 7, 1}));
        System.out.println(new CountDistinctSlicesRush().solution(6, new int[]{3, 4, 5, 5, 2}));
    }
}
