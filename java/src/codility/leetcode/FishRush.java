package codility.leetcode;

import java.util.Stack;

/**
 * This is the solution for Stacks And Queues > Fish
 * <p>
 * This is marked as PAINLESS difficulty
 */
public class FishRush {
    public int solution(int[] weightOfEachFish, int[] directionOfEachFish) {
        int survivalCount = 0;
        Stack<Integer> fishStack = new Stack<>();
        for (int i =0 ; i< weightOfEachFish.length ;i++) {
            int weightOfTheCurrentFish = weightOfEachFish[i];
            if (directionOfEachFish[i] == 1) {
                fishStack.push(weightOfTheCurrentFish);
            } else {
                int wightOfFishFromTheStack = fishStack.isEmpty() ? -1 :fishStack.pop();
                while(!fishStack.isEmpty() && wightOfFishFromTheStack < weightOfTheCurrentFish ) {
                    wightOfFishFromTheStack = fishStack.isEmpty() ? -1 :fishStack.pop();
                }
                if (wightOfFishFromTheStack == -1){
                    survivalCount++;
                } else {
                    fishStack.push(wightOfFishFromTheStack);
                }
            }

        }
        return survivalCount+ fishStack.size();

    }

    public static void main(String[] args) {
//        System.out.println(new Fish().solution(new int[]{4, 8, 2, 6, 7}, new int[]{0, 1, 1, 0, 0}));
        System.out.println(new FishRush().solution(new int[]{4, 3, 2, 1, 5}, new int[]{1, 0, 0, 0, 0}));
    }
}