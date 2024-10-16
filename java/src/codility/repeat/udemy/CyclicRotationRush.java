package codility.repeat.udemy;


import java.util.Arrays;

/**
 * This is the solution for Arrays > CyclicRotation
 * <p>
 * This is marked as PAINLESS difficulty
 */
public class CyclicRotationRush {

    public int[] solution(int[] A, int K) {
        int[] rotatedArray = new int[A.length];
        int length = A.length;
        for (int i = 0 ; i < length ; i++) {
            rotatedArray[(i+K)% length] = A[i];
        }
        return rotatedArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CyclicRotationRush().solution(new int[]{7, 2, 8, 3, 5}, 11)));

        System.out.println(Arrays.toString(new CyclicRotationRush().solution(new int[]{7, 2, 8, 3, 5}, 5)));
    }

}
