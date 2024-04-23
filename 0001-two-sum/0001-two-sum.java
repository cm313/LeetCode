class Solution {
    public int[] twoSum(int[] nums, int target) {
     int n = nums.length;
        int[] a = new int[2];
         HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int value = target-nums[i];
            if(map.containsKey(value)){
                a[0] = i;
                a[1] = map.get(value);
                break;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return a;
        }
}