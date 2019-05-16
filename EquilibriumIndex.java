package arrays;

import java.util.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] a = { -7, 1, 5, 2, -4, 3, 0 };
        int eqIndex = findEquilibriumIndex(a);
        System.out.println("Array is equal at index = " + eqIndex);

    }

    private static int findEquilibriumIndex(int[] a) {
        int totalSum = Arrays.stream(a).sum();

        int sumTillNow = 0;

        for(int i = 0; i < a.length; i++) {
            totalSum -= a[i];
            if(sumTillNow == totalSum) {
                return i; //At this index, the sum is equal
            }
            sumTillNow += a[i];
        }

        return -1;
    }
}
