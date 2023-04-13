package practice.arrays;

import java.util.Arrays;

public class LongestConsecutiveSubSequence {
    public static void main(String[] args) {
        int[] a = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
        int n = a.length;
        int[] lis = new int[n];
        Arrays.fill(lis, 1);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(a[i] > a[j] && Math.abs(a[i] - a[j]) == 1 && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }

        }

        System.out.println(Arrays.stream(lis).max().getAsInt());

    }
}
