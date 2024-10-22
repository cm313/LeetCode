class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majEle=0,count=0;
        for(int x : nums){
            if(count == 0){
                majEle = x;
                count++;
            }
            else if(majEle == x)
            count++;
            else
            count--;
        }
        return majEle;
    }
}