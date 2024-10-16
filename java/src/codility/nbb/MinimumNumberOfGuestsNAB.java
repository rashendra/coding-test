package codility.nbb;


import java.util.Arrays;
import java.util.Collections;

/*
* There are N guests (numbered from 0 to N-1) in a sanatorium waiting to be assigned a room.
* In each room, any number of guests can be accommodated.
*  However, not all guests like to have a lot of roommates.
* You are given an array A of N integers:
* the K-th guest wants to be in a room that contains at most A[K] guests, including themselves.
*  Write a function: int solution (vector &A); that, given the array A, returns the minimum number of rooms needed to accommodate all guests.
* Examples: 1. Given A = [1, 1, 1, 1, 1], your function should return 5.
* Each guest should be accommodated in their own separate room. 2.
*  Given A = [2, 1, 4], your function should return 2. The second guest should be accommodated in one room and the other two guests in another room. 3. Given A = [2, 7, 2, 9, 8], your function should return 2. The first and the third guests should be accommodated in one room and the other three guests in another room. 4. Given A = [7, 3, 1, 1, 4, 5, 4, 9], your function should return 4. The guests can be accommodated as follows: the first two guests in one room, the third and the fourth guests in two single rooms, and the other guests in another room. Write an efficient algorithm for the following assumptions: • N is an integer within the range [1..100,000]; • each element of array A is an integer within the range [1..100,000].
* */
public class MinimumNumberOfGuestsNAB {

    public int solution (int[] guest){

        int numberOfRoom = 0;
        Integer[] guestIntegerArray = Arrays.stream(guest).boxed().toArray( Integer[]::new );
        Arrays.sort(guestIntegerArray, Collections.reverseOrder());
        int localIndex =0 ;
        for(int i =0 ; (i< guestIntegerArray.length && localIndex < guestIntegerArray.length) ; i++){
            int activeNumberOfGuestsCurrently = 1;
            while ((localIndex)< guestIntegerArray.length && guestIntegerArray[localIndex]>= activeNumberOfGuestsCurrently) {
                activeNumberOfGuestsCurrently++;
                localIndex++;
//                System.out.println("Value of localIndex " + localIndex);
            }
            numberOfRoom++;

        }
        return numberOfRoom;


    }


    public static void main(String[] args) {
//        System.out.println(new MinimumNumberOfGuestsNAB().solution(new int[]{1,1,1,1,1}));// 5
//        System.out.println(new MinimumNumberOfGuestsNAB().solution(new int[]{2,1,4}));// 2
//        System.out.println(new MinimumNumberOfGuestsNAB().solution(new int[]{2,7,2,9,8})); // 2
        System.out.println(new MinimumNumberOfGuestsNAB().solution(new int[]{7,3,1,1,4,5,4,9})); //4
//        System.out.println(new MinimumNumberOfGuestsNAB().solution(new int[]{9,7,5,4,3,1,1}));

    }


}
