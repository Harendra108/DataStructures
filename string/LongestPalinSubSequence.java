package practice.string;

public class LongestPalinSubSequence {

    public static void main(String[] args) {
        String str = "agbdba";
        int len = getLongestSeqLength(str.toCharArray());
        System.out.println(len);
    }

    private static int getLongestSeqLength(char[] chars) {
        int[][] cache = new int[chars.length][chars.length];

        int N = chars.length;;
        for(int i = N-1; i >= 0; i--) {
            cache[i][i] = 1;
            for(int j = i+1; j < N; j++) {
                if(chars[i] == chars[j]) {
                    cache[i][j] = 2;
                    if(i+1 < j) {
                        cache[i][j] += cache[i+1][j-1];
                    }
                } else {
                    cache[i][j] = Math.max(cache[i+1][j], cache[i][j-1]);
                }
            }
        }

        //return the max entry in the matrix

        return cache[0][N-1];
    }


}
