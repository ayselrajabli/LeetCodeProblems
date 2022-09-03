#560 task

class Solution {
    public int subarraySum(int[] nums, int k) {
        int number=k,count=0;
        for (int i=0;i<nums.length;i++){
            number=k;
            for(int j=i;j<nums.length;j++){
                number=number-nums[j];
                if (number==0){
                    count++;
                }
            }
        }
        return count;
        }
        
    
}
