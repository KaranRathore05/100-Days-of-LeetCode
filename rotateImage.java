public class rotateImage {

    public static void rotate(int[][] matrix) {
        int len = matrix.length - 1;
        int counter = 0;
        int total = matrix.length / 2;

        // Step 1: Reverse the necessary rows (like using two pointers from top and bottom)
        while (counter < total) {
            int i = counter;
            for (int j = 0; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - i][j];
                matrix[len - i][j] = temp;
            }
            counter++;
        }

        // Step 2: Transpose the matrix (swap elements over the diagonal)
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("Rotated matrix (90 degrees clockwise):");
        printMatrix(matrix);
    }
}
