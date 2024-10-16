package codility.nbb;

public class MinimumDaysToCompleteNABCodility {


    public int solution(int[] D , int X) {

        int minimumNumberOfDays = 0;
        for (int i =0 ; i< D.length ; i++) {
            while ((i+1)< D.length && Math.abs(D[i] - D[i+1]) < X) {
                i++;
            }
            minimumNumberOfDays++;
        }

        return minimumNumberOfDays;

    }
    public static void main(String[] args) {
        System.out.println(new MinimumDaysToCompleteNABCodility().solution(new int[]{2,5, 6,7,10 }, 3));// 3
        System.out.println(new MinimumDaysToCompleteNABCodility().solution(new int[]{5,2,8,7 }, 3)); // 3
        System.out.println(new MinimumDaysToCompleteNABCodility().solution(new int[]{2,5,9,2, 1, 4 }, 4)); // 3
        System.out.println(new MinimumDaysToCompleteNABCodility().solution(new int[]{1,12,10, 4,5 ,4 }, 2)); // 4
        // [5, 8] [3] [9, 10]
    }
}
