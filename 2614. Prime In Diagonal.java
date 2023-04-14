class Solution {
    public int diagonalPrime(int[][] nums) {
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(prime(nums[i][i])) arr.add(nums[i][i]);
        }
        for(int i = 0 ; i<nums.length; i++){
          if(prime(nums[nums.length-i-1][i]))  {
                arr.add(nums[nums.length-i-1][i]);
          }
        }
        if(arr.size()!=0){
        Collections.sort(arr);
        return (int) arr.get(arr.size()-1);
        }
        else return 0;
        

                
    }
    public boolean prime(int n) {
        if (n<=1){
            return false;
        }
        if (n==2){
            return true;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
};
