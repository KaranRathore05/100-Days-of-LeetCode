import java.util.*;

public class PascalTriangleGenerator {

    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();

        if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }

        List<List<Integer>> prevRows = generate(numRows - 1);
        List<Integer> prevRow = prevRows.get(prevRows.size() - 1);

        List<Integer> newRow = new ArrayList<>();
        newRow.add(1); // First element

        for (int i = 1; i < prevRow.size(); i++) {
            newRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }

        newRow.add(1); // Last element
        prevRows.add(newRow);

        return prevRows;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generate(numRows);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
