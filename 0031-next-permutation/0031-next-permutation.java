class Solution {
 
     public static void swap(int[] nums, int i, int j){
        int temp  = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
     }

     public static void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
     }

    public void nextPermutation(int[] nums) {
     int n = nums.length;
     int index1=-1, index2=-1;
     for(int i = n-2; i>=0; i--){
        if(nums[i] < nums[i+1]){
            index1 = i;
            break;
        }
     }
     
     if(index1 == -1){
        reverse(nums, 0, n-1);
     }
     else{
        for(int i=n-1; i>=0; i--){
            if(nums[i]>nums[index1]){
                index2 = i;
                break;
            }
        }
        swap(nums, index1, index2);
        reverse(nums, index1+1,n-1);
     }
    }
}