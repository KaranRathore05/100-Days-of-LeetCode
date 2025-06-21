public class MatrixSearcher {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false; // handle empty matrix
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true; // target found
                }
            }
        }

        return false; // target not found after checking all elements
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };

        int target = 16;
        System.out.println("Is " + target + " in matrix? " + searchMatrix(matrix, target));

        target = 25;
        System.out.println("Is " + target + " in matrix? " + searchMatrix(matrix, target));
    }
}
