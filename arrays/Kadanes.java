package practice.arrays;

public class Kadanes {
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };

        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        int startIndex = 0;
        int endIndex = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] < 0) {
                maxEndingHere = 0;
                continue;
            }

            if(a[i] > 0 && maxEndingHere <= 0) {
                startIndex = i;
            }
            maxEndingHere += a[i];

            maxEndingHere = Math.max(maxEndingHere, 0);
            if(maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                endIndex = i;

            }
        }

        System.out.println("Start " + startIndex);
        System.out.println("end " + endIndex);
        System.out.println(maxSoFar);
    }
}
