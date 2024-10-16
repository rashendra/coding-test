package codility.repeat.udemy;

/**
 * This is the solution for Prefix Sums > Passing Cars
 * <p>
 * This is marked as PAINLESS difficulty
 */

public class PassingCarsRush {

    public int solution(int[] A) {
        int[] suffixSumArray = new int[A.length + 1];
        int count = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            suffixSumArray[i] = A[i] + suffixSumArray[i + 1];
            if (A[i] == 0) {
                count += suffixSumArray[i];
            }
            if (count > 1000000000) {
                return -1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new PassingCarsRush().solution(new int[]{0, 1, 0, 1, 1}));
    }
}

