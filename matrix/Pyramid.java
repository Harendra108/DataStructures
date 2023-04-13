package practice.matrix;

public class Pyramid {
    static int N = 3;

    //  Function for finding maximum sum
    public static int maxPathSum(int[][] tri, int i, int j,
                                 int row, int col)
    {


        if (i == 0) {
            return tri[i][j];
        }

        return tri[i][j]
                + Math.max(
                maxPathSum(tri, i - 1, j, row, col),
                maxPathSum(tri, i - 1, j + 1, row, col));
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int[][] tri = {
                {18, 49, 66, 20, 66},
                {25, 21, 60, 46, 0},
                {69, 58, 53, 0, 0},
                {4, 95, 0, 0, 0},
                {97, 0, 0, 0, 0}
        };
        System.out.print(maxPathSum(tri, 4, 0, 5, 5));
    }
}
