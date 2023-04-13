package practice.misc;

import java.util.*;

public class BalancedParentheses {
    Map<Character, Character> cMap = new HashMap<>();

    List<Character> openingBraces = new ArrayList<>();
    List<Character> closingBraces = new ArrayList<>();

    private void init() {
         cMap.put('}', '{');
         cMap.put(']', '[');
         cMap.put(')', '(');
         openingBraces.add('{');
         openingBraces.add('[');
         openingBraces.add('(');

         //Added the new comment
         closingBraces.add('}');
         closingBraces.add(']');
         closingBraces.add(')');
     }


    private boolean balancedParentheses(char[] parentheses) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < parentheses.length; i++) {
            if(openingBraces.contains(parentheses[i])) {
                stack.push(parentheses[i]); //push the opening brace to the stack
            } else { //if it is a closing brace
                if(!stack.isEmpty() && cMap.get(parentheses[i]) == stack.peek()) {
                    stack.pop();
                    continue;//for the next element
                }
                return false;
            }
        }
        if(!stack.isEmpty()) {
            return false;
        }
        return true; //All the parentheses were matching
    }

    public static void main(String[] args) {
        char exp[] = {'{','(',')','}','[',']'};
        BalancedParentheses bp = new BalancedParentheses();
        bp.init();
        System.out.println(bp.balancedParentheses(exp));
    }

}
