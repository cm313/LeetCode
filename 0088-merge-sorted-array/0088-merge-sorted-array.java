class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // brutefore solution
    /*    int f_pointer = 0;
        int s_pointer = 0;
        for(int i=0; i<m; i++){
           f_pointer++;
        }
        for(int i=f_pointer; i<m+n; i++){
           nums1[i] = nums2[s_pointer];
            s_pointer++;
        }
        Arrays.sort(nums1);
        */
        // optimal solution

        int  f_po = m-1;
        int  s_po = n-1;
        int t_po = m+n-1;
        while(s_po>=0){
          if(f_po>=0 && nums1[f_po]>nums2[s_po]){
             nums1[t_po--] = nums1[f_po--];
          }
            else{
                nums1[t_po--] = nums2[s_po--];
            }
        }
    }
}