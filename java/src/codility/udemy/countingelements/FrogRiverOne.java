package codility.udemy.countingelements;

/**
 * This is the solution for CountingElements > FrogRiverOne
 * <p>
 * This is marked as PAINLESS difficulty
 */
public class FrogRiverOne {
    /*
    * int X is the length of the array !
    * */
    public int solution(int X, int[] A) {
        boolean[] riverPositions = new boolean[X + 1]; // whay are we creating an array the size of X+ 1
        // for each array of positions.
        for (int time = 0; time < A.length; time++) { // time < A.length will iterate through all the elements.
            int pos = A[time];
            if (!riverPositions[pos]) { // riverPositions starts at 0. Particular river position is empty. !false --> true.
                riverPositions[pos] = true;
                // you can use the same X variable or a separate counter variable
                X -= 1;// We only need to do this the exact number of time of the full length of the path. remember, we only count the unique positions with the condition we have in line number 17.
                if (X == 0){ // This is where we determine, example 5 uniques positions all have been addressed
                    return time; // As soon as we find all the positions are occupied we will be sending the current time. Note, the current position will only iterate over the given array.
                }


            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FrogRiverOne().solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        System.out.println(new FrogRiverOne().solution(1, new int[]{1, 1, 1}));
        System.out.println(new FrogRiverOne().solution(3, new int[]{1, 2, 1}));

        System.out.println(new FrogRiverOne().solution2(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        System.out.println(new FrogRiverOne().solution2(1, new int[]{1, 1, 1}));
        System.out.println(new FrogRiverOne().solution2(3, new int[]{1, 2, 1}));
    }


    /*
     * int X is the length of the array !
     * */
    // Alternative solution.
    public int solution2(int X, int[] A) {
        boolean[] riverPositions = new boolean[X + 1]; // whay are we creating an array the size of X+ 1
        // for each array of positions.
        int counter = 0;
        for (int time = 0; time < A.length; time++) { // time < A.length will iterate through all the elements.
            int pos = A[time];
            if (!riverPositions[pos]) { // riverPositions starts at 0. Particular river position is empty. !false --> true.
                riverPositions[pos] = true;
                // you can use the same X variable or a separate counter variable
                counter++;
                if (counter == X){ // This is where we determine, example 5 uniques positions all have been addressed
                    return time; // As soon as we find all the positions are occupied we will be sending the current time. Note, the current position will only iterate over the given array.
                }


            }
        }
        return -1;
    }
}
