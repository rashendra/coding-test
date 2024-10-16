package codility.leetcode;

/**
 * This is the solution for Maximum Slice Problem > Max Profit
 * <p>
 * This is marked as PAINLESS difficulty
 */

public class MaxProfitRush {
    public int solution(int[] A) {
        int localMaxProfit = 0 ;
        int globalMaxProfit = 0;
        for (int i=0 ; i < A.length ; i++) {
            int delta = A[i] - A[i+1];
            localMaxProfit = Math.max(localMaxProfit, delta + localMaxProfit);
            globalMaxProfit = Math.max(localMaxProfit, globalMaxProfit);

        }
        return globalMaxProfit> 0 ? globalMaxProfit: 0;


    }

    public static void main(String[] args) {
        //                                                           -2160,   112,   243,  -353,   354
        System.out.println(new MaxProfitRush().solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
    }

}
