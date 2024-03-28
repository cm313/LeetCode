class Solution {
    public int[] twoSum(int[] nums, int target) {
     int[]arr = new int[2];
     int n = nums.length;
     int first = 0;
     int last = n-1;
     for(int i=0; i<n; i++){
        int res = nums[first]+nums[last];
        if(res==target){
            arr[0] = first+1;
            arr[1] = last+1;
         }
         else if(res>target){
            last--;
         }
         else{
            first++;
            }
     }
     return arr;
    }
}