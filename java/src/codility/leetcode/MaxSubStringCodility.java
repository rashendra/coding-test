package codility.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the solution for Caterpillar method > CountDistinctSlices
 *
 * This is marked as PAINLESS difficulty
 */

public class MaxSubStringCodility {
    public int solution(String mainString) {

        char[] charsArray = mainString.toCharArray();

        int head = 0;
        String globalMaxString = "";
        for (int tail = 0; tail < charsArray.length; tail++) {
            Map<String, Boolean> booleanMap = getBooleanMap();
            StringBuffer localStringBuffer =  new StringBuffer();
            while (head < charsArray.length && !booleanMap.get(String.valueOf(charsArray[head]))) { // inCurrentSlice[A[head] ==> false means no duplicates
                booleanMap.put(String.valueOf(charsArray[head]) , true);
                localStringBuffer.append(charsArray[head]);
                head += 1;
            }
            if (localStringBuffer.length() >= globalMaxString.length()) {
                globalMaxString = localStringBuffer.toString();
            }

            // exit the while loop and enter the duplicate mode
//            inCurrentSlice[A[tail]] = false;// we keep increasing the tail and setting that for false.
        }
        System.out.println(globalMaxString);
        return globalMaxString.length();
    }

    public static  Map<String, Boolean> getBooleanMap () {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Map<String, Boolean> stringBooleanMap = new HashMap<>();
        for(char character: alphabet) {
            stringBooleanMap.put(String.valueOf(character), false);
        }

        return stringBooleanMap;
    }

    public static void main(String[] args) {
        System.out.println(new MaxSubStringCodility().solution("abcabcbb"));
        System.out.println(new MaxSubStringCodility().solution("bbbbb"));
        System.out.println(new MaxSubStringCodility().solution("pwwkeabw"));
    }
}
