package practice.string;

import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "geeks for geeks is best";
        Stack<Character> stack = new Stack<>();
        stack.push(str.charAt(0));
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(stack.peek() == currentChar){
                continue;
            }  else {
                stack.push(currentChar);
                sb.append(currentChar);
            }

        }

        System.out.println(sb.toString());
    }
}
