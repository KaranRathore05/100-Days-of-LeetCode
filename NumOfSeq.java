public class NumOfSeq {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100]; // max key is 9*10 + 9 = 99
        int result = 0;

        for (int[] d : dominoes) {
            int a = Math.min(d[0], d[1]);
            int b = Math.max(d[0], d[1]);
            int key = a * 10 + b;
            result += count[key];
            count[key]++;
        }

        return result;
    }
}
