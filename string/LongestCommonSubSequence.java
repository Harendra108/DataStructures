package practice.string;

public class LongestCommonSubSequence {
    int lcs(String X, String Y, int m, int n)
    {
        int[][] L = new int[m + 1][n + 1];

        // Following steps build L[m+1][n+1] in bottom up
        // fashion. Note that L[i][j] contains length of LCS
        // of X[0..i-1] and Y[0..j-1]
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X.charAt(i - 1) == Y.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;
                else
                    L[i][j] = max(L[i - 1][j], L[i][j - 1]);
            }
        }
        return L[m][n];
    }

    // Utility function to get max of 2 integers
    int max(int a, int b) { return Math.max(a, b); }

    public static void main(String[] args)
    {
        LongestCommonSubSequence lcs
                = new LongestCommonSubSequence();
        String S1 = "AGGTAB";
        String S2 = "GXTXAYB";
        int m = S1.length();
        int n = S2.length();

        System.out.println("Length of LCS is"
                + " " + lcs.lcs(S1, S2, m, n));
    }

}
