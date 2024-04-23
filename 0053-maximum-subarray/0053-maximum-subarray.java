class Solution {
    public int maxSubArray(int[] nums) {
      int curSum=0, maxSum=Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            curSum += nums[i];
             if(curSum > maxSum){
                maxSum = curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }
}