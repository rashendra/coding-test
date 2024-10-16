package codility.repeat.udemy;

/**
 * This is the solution for Sorting > NumberOfDiscIntersections
 * <p>
 * This is marked as RESPECTABLE difficulty
 */

import java.util.Arrays;

public class NumberOfDiscIntersectionsRush {
    public int solution(int A[]) {
        int numberOfIntersection = 0;
        int numberOfActiveIntersections = 0;

        int length = A.length;
        int j =0;
        DiscLog[] discLogs = new DiscLog[length * 2];
        // Two for loops
        for (int i = 0 ; i< length ; ) {
            discLogs[j++] = new DiscLog(i - A[i], 1);
            discLogs[j++] = new DiscLog(i + A[i], -1);
        }

        Arrays.sort(discLogs); // Sorting the array , note how we choose the starting index if its not equal , and the startENd if its equald
        for (DiscLog log : discLogs) {

            if (log.startEnd > 1) {
                numberOfIntersection = numberOfIntersection + numberOfActiveIntersections -1;
            }
            if (numberOfIntersection > 10000000) {
                return  -1;
            }
        }
        return numberOfIntersection;

    }

    class DiscLog implements Comparable<DiscLog> {
        final long x;
        final int startEnd;

        DiscLog(long x, int startEnd) {
            this.x = x;
            this.startEnd = startEnd;
        }

        @Override
        public int compareTo(DiscLog o) {
            return this.x !=  o.x ?Long.compare(this.x, o.x) : Integer.compare(o.startEnd, this.startEnd);
        }
    }


    public static void main(String[] args) {
        System.out.println(new NumberOfDiscIntersectionsRush().solution(new int[]{1, 5, 2, 1, 4, 0}));
    }
}
