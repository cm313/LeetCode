class Solution {
    public void rotate(int[] nums, int k) {
        //below code is not working ,,needs to update
       /* int len=nums.length;
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            if(i+k<len){
                arr[i+k]=nums[i];
            }
        }
        for(int i=0;i<k;i++){
             else
            arr[i]=nums[k+i+1];
        }
        int i=0;
        for(int val:arr){
            nums[i++]=val;
        } 

        // working code
      int len=nums.length;
      int arr[]=new int[len];
      for(int i=0;i<len;i++){
          arr[(i+k)%len]=nums[i];
      }
         int i=0;
        for(int val:arr){
            nums[i++]=val;
        } 
        // my approach accepted but when submitting given TLE
        int i=0;
        while(i<k){
          int n = nums.length;
            int temp = nums[n-1];
            for(int j=n-2; j>=0; j--){
                nums[j+1] = nums[j];
            }
            nums[0] = temp;
            i++;
        } */
        
         int len=nums.length;
      int arr[]=new int[len];
      for(int i=0;i<len;i++){
          arr[(i+k)%len]=nums[i];
      }
         int i=0;
        for(int val:arr){
            nums[i++]=val;
        } 
    }
}