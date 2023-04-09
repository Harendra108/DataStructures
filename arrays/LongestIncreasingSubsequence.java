package practice.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] a = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int[] lis = new int[a.length];
        Arrays.fill(lis, 1);
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < i; j++) {
                if(a[i] > a[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        System.out.println(Arrays.stream(lis).max().getAsInt());

    }
}
