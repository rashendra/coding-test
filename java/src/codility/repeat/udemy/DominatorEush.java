package codility.repeat.udemy;

/**
 * This is the solution for Leader > Dominator
 *
 * This is marked as PAINLESS difficulty
 */

public class DominatorEush {
    public int solution(int[] A) {
        int candidateItem = 0 ;
        int consecutiveSize = 0;

        for (int item : A) {
            if (consecutiveSize == 0 ) {
                candidateItem = item;
                consecutiveSize++;
            } else if (candidateItem == item){
                consecutiveSize++;
            } else {
                consecutiveSize--;
            }
        }

        int countCandidateItem = 0 ;
        int index = 0;
        for (int i= 0; i< A.length; i++) { // You need to use the traditional for loop
            if (A[i] == candidateItem) {
                countCandidateItem++;
                index = i;
            }

        }

        return countCandidateItem > A.length / 2 ? index : -1;
    }

    public static void main(String[] args) {
        System.out.println(new DominatorEush().solution(new int[]{3, 0, 1, 1, 4, 1, 1}));
        System.out.println(new DominatorEush().solution(new int[]{1, 2, 3, 4, 5, 6, 7}));
        System.out.println(new DominatorEush().solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));
    }

}
