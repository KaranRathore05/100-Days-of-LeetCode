import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;

        int[][] result = construct2DArray(original, m, n);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) return new int[0][0];

        int[][] result = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            result[i / n][i % n] = original[i];
        }
        return result;
    }
}
