package codility.repeat.udemy;

/**
 * This is the solution for Greedy > TieRope
 *
 * This is marked as PAINLESS difficulty
 */
public class TieRopes {
//    public int solution(int K, int[] A) {
//        int count = 0;
//        int currentRopeLength = 0;
//        for(int rope: A) {
//            currentRopeLength = rope + currentRopeLength;
//            if (currentRopeLength >= K) {
//                count++;
//                currentRopeLength =0;
//            }
//        }
//
//        return count;
//    }


    public static void main(String[] args) {
        System.out.println(new TieRopes().solution(4, new int[]{1, 2, 3, 4, 1, 1, 3}));
        System.out.println(new TieRopes().solution(4, new int[]{1,1, 2, 3, 4, 1,5, 1, 3}));
    }

    private int solution(int k, int[] ropesArray) {
        int ropeCount = 0;
        int ropeLength = 0;
        for (int ropeElement : ropesArray ){
            ropeLength = ropeElement + ropeLength;
            if (ropeLength > k){
                ropeCount++;
                ropeLength = 0;
            }
        }
        return ropeCount;

    }
}
