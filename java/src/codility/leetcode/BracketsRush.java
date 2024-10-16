package codility.leetcode;

import java.util.Stack;

/**
 * This is the solution for Stacks And Queues > Brackets
 * <p>
 * This is marked as PAINLESS difficulty
 */
public class BracketsRush {
    public int solution(String s) {
        Stack<Character> brackets = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                brackets.push(c);
            } else if (c == ')') {
                if (brackets.isEmpty() || brackets.pop() !='(') return 0;
            } else if (c == '}'){
                if (brackets.isEmpty() || brackets.pop() !='{') return 0;
            } else if (c == ']') {
                if (brackets.isEmpty() || brackets.pop() !='[') return 0;
            }

        }
            return brackets.isEmpty() ? 1: 0;
    }

    public static void main(String[] args) {
        System.out.println(new BracketsRush().solution("()[]{}()[]{}"));
        System.out.println(new BracketsRush().solution("()[]{}()[]{}[]"));
        System.out.println(new BracketsRush().solution("()]]"));
        System.out.println(new BracketsRush().solution("()]]"));
    }
}
