package practice.misc;

import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedArrays {
    public static void main(String[] args) {
        int[] a = {2, 6, 12, 34};
        int[] b = {1, 9, 20, 1000};
        int[] c = {23, 34, 90, 2000};

        mergeKSortedArrays(a, b, c);
    }

    private static void mergeKSortedArrays(int[] a, int[] b, int[] c) {
        Queue<Integer> pq = new PriorityQueue<>(3 * a.length);
        int aIndex = 0;
        int bIndex = 0;
        int cIndex = 0;
        while (aIndex < a.length && bIndex < a.length && cIndex < a.length) {
            //find the max element
            if(a[aIndex] < b[bIndex] && a[aIndex] < c[cIndex]) {
                //a[aIndex] is the smallest. Put this in the pq and increment the aIndex
                pq.add(a[aIndex]);
                aIndex++;
            } else if(b[bIndex] < a[aIndex] && b[bIndex] < c[cIndex]) {
                pq.add(b[bIndex]);
                bIndex++;
            } else if(c[cIndex] < b[bIndex] && c[cIndex] < a[aIndex]) {
                pq.add(c[cIndex]);
                cIndex++;
            } else {//a==b, b==c, a==c
                if(a[aIndex] == c[cIndex]) {
                    pq.add(a[aIndex]);
                    aIndex++;
                    cIndex++;
                } else if(a[aIndex] == b[bIndex]) {
                    pq.add(b[bIndex]);
                    aIndex++;
                    bIndex++;
                } else {
                    //b==c
                    pq.add(b[bIndex]);
                    bIndex++;
                    cIndex++;
                }
            }
        }

        while(aIndex < a.length) {
            pq.add(a[aIndex]);
            aIndex++;
        }

        while(bIndex < a.length) {
            pq.add(b[bIndex]);
            bIndex++;
        }

        while(cIndex < a.length) {
            pq.add(c[cIndex]);
            cIndex++;
        }

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
