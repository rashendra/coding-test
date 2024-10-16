package codility.nbb;

import java.util.HashMap;
import java.util.Map;

public class ValidLettersNAB {


    public int solution(String str) {
        char[] chars = str.toCharArray();
        Map<Character , Boolean> hasLowerCase = new HashMap<Character ,Boolean>();
        Map<Character , Boolean> hasUpperCase = new HashMap<Character ,Boolean>();
        Map<Character , Integer> upperCaseFistIndex = new HashMap<Character ,Integer>();// need to find the 1st upper case
        Map<Character , Integer> lowerCaseLastIndex = new HashMap<Character ,Integer>();// need to find the last lower case

        int validLatter =0 ;
        // Two for loops

        for (int i= 0; i < chars.length ; i++) {
            char iteratedCharacter = chars[i];
            if (Character.isLowerCase(iteratedCharacter)) {
                hasLowerCase.put(iteratedCharacter,true);
                // for the 1st time lowerCaseLastIndex.get(iteratedCharacter) will be null
                if (lowerCaseLastIndex.get(iteratedCharacter) == null || lowerCaseLastIndex.get(iteratedCharacter)<= i) {
                    lowerCaseLastIndex.put(iteratedCharacter,i);
                }

            } else if (Character.isUpperCase(chars[i])) {
                hasUpperCase.put(iteratedCharacter,true);
                if (upperCaseFistIndex.get(iteratedCharacter) == null || upperCaseFistIndex.get(iteratedCharacter) >=i ){
                    upperCaseFistIndex.put(iteratedCharacter,i);
                }
            }
        }
        Map<Character, Boolean> finalCorrectLetter = new HashMap<Character, Boolean>();
        for(int i= 0; i < chars.length ; i++) {
            char iteratedCharacterUpper = Character.toUpperCase(chars[i]);
            char iteratedCharacterLower = Character.toLowerCase(chars[i]);;
            System.out.println("Original "+chars[i]);
            System.out.println(hasLowerCase.get(iteratedCharacterLower));

            if(hasLowerCase.get(iteratedCharacterLower) != null && hasUpperCase.get(iteratedCharacterUpper) != null && // should have an upper case and a lower case
                    hasLowerCase.get(iteratedCharacterLower) && hasUpperCase.get(iteratedCharacterUpper) &&
                    ( lowerCaseLastIndex.get(iteratedCharacterLower) <
                            upperCaseFistIndex.get(iteratedCharacterUpper))) {
                System.out.println("Should not go each time");
                finalCorrectLetter.put(iteratedCharacterUpper,true);
                validLatter++;
            }

        }

        return finalCorrectLetter.size();
    }

    /*
    * Letter should have an upper case and a lower case
    * All lower case should be before upper case
    * if an letter has a lower case instance is there after upper case , then its not valid.
    * */
    public static void main(String[] args) {

        System.out.println(new ValidLettersNAB().solution("abcABCc"));
    }
}
