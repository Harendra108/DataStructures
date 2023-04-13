package practice.misc;

import java.util.Stack;

public class NGE {
    private void findNGE(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        stack.add(arr[0]);//add the first element to the stack
        for(int i = 1; i < arr.length; i++) {
            int next = arr[i]; //this element will serve the next element

            while(!stack.isEmpty() && next > stack.peek()) { //next will serve as the NGE for all the previous elements
                System.out.println(next + " is NGE for " + stack.pop());
            }
            //insert next as we need to find the NGE for this array
            stack.add(next);
        }
        while(!stack.isEmpty()) {
            System.out.println(-1 + " is NGE for " + stack.pop());
        }
    }

    public static void main(String[] args) {
        NGE nge = new NGE();
        int[] array = {11, 13, 21, 3};
        nge.findNGE(array);
    }
}
