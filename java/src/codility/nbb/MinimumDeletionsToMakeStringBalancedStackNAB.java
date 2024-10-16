package codility.nbb;
/*
* https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/
* */

import java.util.Stack;

public class MinimumDeletionsToMakeStringBalancedStackNAB {

    public int minimumDeletions(String s) {
        // basically we remove the ba pairs . We pop the b and skip pushing the a.
        int n = s.length();
        Stack<Character> charStack = new Stack<>();
        int deleteCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < n; i++) {
            // If stack is not empty, top of stack is 'b',
            // and current char is 'a'
            if (!charStack.isEmpty() && charStack.peek() == 'b' && s.charAt(i) == 'a') {
                System.out.println("Not pushing "+s.charAt(i) +" as peek is "+ charStack.peek()+ " We will skip and count as a delete option");
                charStack.pop(); // Remove 'b' from stack
                deleteCount++; // Increment deletion count
            } else { // if the stack is empty you simply put anything in there
                System.out.println("Pushing element "+s.charAt(i) );
                charStack.push(s.charAt(i)); // Push current character onto stack
            }
        }

        return deleteCount;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumDeletionsToMakeStringBalancedStackNAB().minimumDeletions("aababbab"));
        System.out.println(new MinimumDeletionsToMakeStringBalancedStackNAB().minimumDeletions("bbaaaaabb"));

    }
}
