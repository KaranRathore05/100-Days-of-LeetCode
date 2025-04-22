public class SetMismatch {
     
        public int[] findErrorNums(int[] nums) {
            int n = nums.length;               // size of array
            int[] count = new int[n + 1];      // make a count array from 0 to n
    
            // count how many times each number appears
            for (int num : nums) {
                count[num]++;
            }
    
            int duplicate = -1, missing = -1;
    
            // check which number is duplicate and which one is missing
            for (int i = 1; i <= n; i++) {
                if (count[i] == 2) duplicate = i;
                else if (count[i] == 0) missing = i;
            }
    
            return new int[]{duplicate, missing};  // return as [repeated, missing]
        }
    }
    

