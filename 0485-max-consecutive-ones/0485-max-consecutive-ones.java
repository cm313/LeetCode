
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0, j=0, count=0, max_count=0;
        int n = nums.length;
        while(j<n){
            if(nums[j]==0){
                if(count > max_count){
                    max_count = count;
                }
                count = 0;
                j++;
                i=j;
            }
            else {
                j++;
                count ++;
                if(count > max_count){
                    max_count = count;
                }
            }
        }
        return max_count;
        }
    }