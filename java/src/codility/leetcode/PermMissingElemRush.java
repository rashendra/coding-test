package codility.leetcode;

/**
 * This is the solution for Time Complexity > PermMissingElem
 * <p>
 * This is marked as PAINLESS difficulty
 * In here you need to remeber that the count of an array would be
 */
public class PermMissingElemRush {
    public int solution(int[] A) {
        int missingElement =0;
        int currentArrayValue = 0;
        for (int i: A) {
            currentArrayValue = currentArrayValue + i;
        }
        int maxCount = A.length+1;
        int expectedArrayValue =( maxCount * (maxCount+ 1))/2; // This is important
        missingElement = expectedArrayValue - currentArrayValue;
        return missingElement;

    }

    public static void main(String[] args) {
        System.out.println(new PermMissingElemRush().solution(new int[]{2, 3, 1, 5}));
        System.out.println(new PermMissingElemRush().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(new PermMissingElemRush().solution(new int[]{}));
    }
}
