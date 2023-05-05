package practice.problemsolving.leetcode.easy;

import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s) {

        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
               characterStack.push(c);
            }else {
                if (characterStack.isEmpty())
                    return false;
                char prev = characterStack.pop();
                if (
                        (c == ')' && prev == '(')
                                || (c == '}' && prev == '{')
                                || (c == ']' && prev == '[')

                ){}
                else {
                    return false;
                }
            }
        }
        return characterStack.empty();
    }

    public static void main(String[] args) {
        ValidParenthesis v = new ValidParenthesis();
        System.out.println(v.isValid("]"));
        System.out.println(v.isValid("{}[)"));
    }
}
