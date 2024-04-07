
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
            int i=0, j=0;
            int count = 0, max_count=0;
        while(j<nums.length){
            if(nums[j]!=0){
              count++;
                j++;
            }
            else if( nums[j] == 0){
                if(count > max_count){
                    max_count = count;
                }
                count = 0;
                j++;
                i = j;
            }
        }
         if(count >  max_count)
             return count;
        return max_count;
        }
    }