class Solution {
    public int longestNiceSubarray(int[] nums) {
        int a=0, i=0, result=0;
        for (int j=0; j<nums.length;j++) {
            while ((a & nums[j]) > 0)
                a ^= nums[i++];
            a |= nums[j];
            result = Math.max(result, j-i+1);
        }
        return result;
        
    }
}
