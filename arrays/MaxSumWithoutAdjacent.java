package practice.arrays;

public class MaxSumWithoutAdjacent {
    int findMaxSum(int[] arr, int n)
    {
        int incl = arr[0];
        int excl = 0;
        int excl_new;
        int i;

        for (i = 1; i < n; i++) {
            // Current max excluding i
            excl_new = Math.max(incl, excl);

            // Current max including i
            incl = excl + arr[i];
            excl = excl_new;
        }

        // Return max of incl and excl
        return Math.max(incl, excl);
    }

    // Driver code
    public static void main(String[] args)
    {
        MaxSumWithoutAdjacent sum = new MaxSumWithoutAdjacent();
        int[] arr = { 5, 5, 10, 100, 10, 5 };

        // Function call
        System.out.println(
                sum.findMaxSum(arr, arr.length));
    }
}
