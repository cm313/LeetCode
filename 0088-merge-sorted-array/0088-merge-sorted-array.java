class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int f_pointer = 0;
        int s_pointer = 0;
        for(int i=0; i<m; i++){
           f_pointer++;
        }
        for(int i=f_pointer; i<m+n; i++){
           nums1[i] = nums2[s_pointer];
            s_pointer++;
        }
        Arrays.sort(nums1);
    }
}