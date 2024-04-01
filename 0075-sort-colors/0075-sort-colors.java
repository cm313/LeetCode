class Solution {
    public void sortColors(int[] arr) {
        int len  = arr.length;
        int low = 0, mid = 0, high = len-1;
        while(mid<=high){
         if(arr[mid] == 0){
            int temp = arr[mid];
             arr[mid] = arr[low];
             arr[low] = temp;
             low++;
             mid++;
         }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
               int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}