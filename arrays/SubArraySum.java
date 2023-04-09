package practice.arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class SubArraySum {
    public static void main(String[] args) {
        int[] a = {7, 10, 4, 3, 20, 15};
        //find the kth Largest
        Queue<Integer> pq = new PriorityQueue<>();
        int k = 3;
        for (int j : a) {
            if (pq.size() < k) {
                pq.add(j);
                continue;
            }
            if (j > pq.peek()) {
                pq.poll();
                pq.add(j);
            }
        }

        System.out.println("Kth Largest = " + pq.peek());

    }
}
