import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
     Set<Integer> set = new LinkedHashSet<>();
        int len = nums.length;
        for(int ele: nums){
            set.add(ele);
        }
        int i =0;
        for(int ele: set){
         nums[i++] = ele;
        }
        return set.size();
}
}