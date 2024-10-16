package codility.nbb;

/*
* Kevin got this.
* */
public class WoodenSticksOfLengthAandBNAB {


    // Create the largest possible square
    public int solution(int A, int B) {
        double maxSideOfTheSquare = Math.floor((A+B)/(double)4);
        System.out.println(maxSideOfTheSquare);
        // Ensure A is the larger one
        if (A < B ) {
            int temp = A;
            A = B ;
            B = temp;
        }

        for (int side = A; side > 0; side --) {
            int countA = A / side;
            int countB = B / side;

            if (countA + countB >= 4 ) {
                return side;
            }
        }
        return 0;// if there are no values
    }

    public static void main(String[] args) {
        System.out.println(new WoodenSticksOfLengthAandBNAB().solution(10, 21));// Should return 7
        System.out.println(new WoodenSticksOfLengthAandBNAB().solution(13, 11));// Should return 5
        System.out.println(new WoodenSticksOfLengthAandBNAB().solution(2, 1));// Should return 0
    }
}
