package codility.nbb;
/*
* https://www.chegg.com/homework-help/questions-and-answers/group-friends-going-holiday-together-come-meeting-point-start-journey-using-n-cars-p-k-peo-q90988854
* */

import java.util.Arrays;
import java.util.Collections;

public class MinimumCarSolutionNAB {

    public int solution(int[] P, int[] S){
        int minNumberOfCars = 0;
        int totalPassengers = Arrays.stream(P).sum();
//        System.out.println(totalPassengers);
        Integer [] seat = new Integer[S.length];
        for (int i = 0 ; i < S.length; i++){
            seat[i] = S[i];
        }
        Arrays.sort(seat, Collections.reverseOrder());

//        for(int i= 0; i < seat.length ; i++){
//            if (totalPassengers  > 0){
//                System.out.println("seats"+ seat[i]);
//                totalPassengers = totalPassengers - seat[i];
//                minNumberOfCars++;
//            }
//        }
        int  carsRequired = 0;
        int index = 0;
        while (totalPassengers> 0){
            totalPassengers = totalPassengers - seat[index];
            carsRequired++;
        }

        return carsRequired;

    }

    public static void main(String[] args) {

        System.out.println(new MinimumCarSolutionNAB().solution( new int[]{1, 4, 1} ,new int[]{1, 5, 1}));
        System.out.println(new MinimumCarSolutionNAB().solution( new int[]{4, 4, 2, 4} ,new int[]{5, 5, 2, 5}));
        System.out.println(new MinimumCarSolutionNAB().solution( new int[]{2, 3, 4, 2} ,new int[]{2, 5, 7, 2}));
    }

}
