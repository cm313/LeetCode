class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length,i=1;
        int currSum=nums[0],maxSum=nums[0];
         while(i<n){
            if(currSum<0)
             currSum = 0;
             currSum += nums[i];
             maxSum = Math.max(maxSum,currSum);
             i++;
         }
         return maxSum;
    }
}