class Solution {
    public int[] rearrangeArray(int[] nums) {
      int n = nums.length; 
      int temp1=0,temp2=0;
      int[] pos = new int[n/2];
      int[] neg = new int[n/2];
      for(int i=0; i<n; i++){
        if(nums[i] >0){
           pos[temp1] = nums[i];
           temp1++;;
        }
        else if(nums[i]<0){
            neg[temp2] = nums[i];
            temp2++;
        }
      }
      int temp3=0,temp4=0;
      for(int i=0; i<n; i++){
        if((i%2) == 0){
            nums[i] = pos[temp3];
            temp3++;
        }
        else{
            nums[i] = neg[temp4];
            temp4++;
        }
      }
      return nums;
    }
}