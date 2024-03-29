import java.util.*;
class Solution {
public int removeDuplicates(int[] nums) {
 int f_pointer = 0;
  int s_pointer = 0;
 for(int i=0; i<nums.length-1; i++){
    if(nums[i]!=nums[i+1]){
         s_pointer = i+1;
        nums[++f_pointer] = nums[s_pointer];
    }
 }
    return f_pointer+1;
}
}