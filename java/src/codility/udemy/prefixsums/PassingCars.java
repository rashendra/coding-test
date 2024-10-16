package codility.udemy.prefixsums;

/**
 * This is the solution for Prefix Sums > Passing Cars
 * <p>
 * This is marked as PAINLESS difficulty
 */

public class PassingCars {

    public int solution(int[] A) {
        int count = 0 ;
        // Creating the suffix sum array
        int[] suffixSumArray = new int[A.length + 1];
        for (int i = A.length -1 ; i >=0 ; i-- ) {
            suffixSumArray[i] = A[i] + suffixSumArray[i+1];
        }

        // now lets calculate the elemements
        for (int i= 0 ; i < A.length ; i++) {
            if(A[i] == 0) {
                count = count + suffixSumArray[i];
            }
            if ( count > 100000000) {
                return  -1;
            }
        }
        return count;


    }

    public static void main(String[] args) {
        System.out.println(new PassingCars().solution(new int[]{0, 1, 0, 1, 1}));
    }
}

