class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        int sum = 0, count = 0;
       for(;j<k; j++){
           sum += arr[j];          
       }
        if(sum/k >= threshold){
            count++;
        }
        while(j<n){
            sum+=arr[j];
            sum-=arr[i];
            if(sum/k >= threshold)
                count++;
            j++;
            i++;
            
        }
        return count;
    }
}