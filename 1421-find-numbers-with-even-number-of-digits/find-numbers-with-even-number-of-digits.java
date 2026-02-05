class Solution {
    public int findNumbers(int[] nums) {
            int count=0;
            for (int j : nums) {
            int flag = 0;
            while (j > 0) {
                j /= 10;
                flag++;
            }
            if (flag % 2 == 0) {
                count++;
            }
            
    }
    return count;
}
}