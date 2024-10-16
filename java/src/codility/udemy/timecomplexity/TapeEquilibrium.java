package codility.udemy.timecomplexity;

/**
 * This is the solution for Time Complexity > TapeEquilibrium
 * <p>
 * This is marked as PAINLESS difficulty
 */
public class TapeEquilibrium {
    public int solution(int[] A) {
        int leftSum = A[0];
        int rightSum = 0;// This is the temp right sum
        //Basically get the total sum of the array in this case.
        for (int x : A) {
            rightSum += x;
        }
        System.out.println("This is the right sum"+ rightSum);
//        rightSum -= leftSum;
        rightSum = rightSum - leftSum;
        System.out.println(" Now this is the correct right sum "+ rightSum);

        int diff = Math.abs(leftSum - rightSum); // Initial different between the 1st element of the array - rest of the elements of the array. ≠≠≠
        for (int i = 1; i < A.length - 1; i++) { // this will iterate through the array elements O(n) which the n would be the list of elements
            leftSum += A[i]; // left sum keeps adding new item
            rightSum -= A[i]; // right sum keeps subtracting the new item
            int currentDiff = Math.abs(leftSum - rightSum); // Simply gets the absolute value. That is all.
            if (diff > currentDiff) { // initial different is greater than the current one, we should assign the current different as the diff.
                diff = currentDiff;
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        System.out.println(new TapeEquilibrium().solution(new int[]{3, 1, 2, 4, 3}));
        System.out.println(new TapeEquilibrium().solution(new int[]{3, 9, 2, 4, 3}));
    }
}