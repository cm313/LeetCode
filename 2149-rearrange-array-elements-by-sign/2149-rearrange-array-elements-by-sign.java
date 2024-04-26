class Solution {
    public int[] rearrangeArray(int[] nums) {
      int n = nums.length;
        int[] arr = new int[n];
        int i=0;
        int even_index = 0, odd_index=1;
        while(i<n){
            if(nums[i] > 0){
                arr[even_index] = nums[i];
                even_index += 2;
            }
            else if(nums[i] < 0){
                arr[odd_index] = nums[i];
               odd_index += 2;
            }
            i++;
            }
        return arr;
    }
}