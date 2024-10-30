class Solution {
    public int longestConsecutive(int[] nums) {
     
      int n= nums.length;
        Arrays.sort(nums);
        int i=0,j=1;
        int max1=0,max2=0,count=1;
        if(n==0){
            return 0;
        }
       while(i<n-1){
           if(nums[i]==nums[j]){
               i++;
               j++;
           }
           else if( nums[j]==nums[i]+1){
               count++;
               i++;
               j++;
           }
           else {
               if(count>max1)
               max1=count;
               count=1;
               i++;
               j++;
           }

           }
            max2=count;
            if(max1>max2)
            return max1;
             return max2;
       }
}

      /* int n = nums.length;
       int i=0, j=1, count=0, maxCount=0;
       SortedSet<Integer> set = new TreeSet<>(Arrays.asList(nums));
       int len = set.Size();
       int[] arr  = new int[size];
       arr = set.toArray();
       if(n==0)
       return 0;
       while(j<n){
         if(arr[i]+1 == arr[j]){
           count++;
         }
         else{
            count = 0;
         }

        if(count > maxCount){
            maxCount = count;
        }
         i++;
         j++;
       }
       return maxCount+1; */
