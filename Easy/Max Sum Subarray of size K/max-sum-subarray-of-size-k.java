//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        int first  = 0;
        int last  = K;
        long sum=0, max_sum=0;
        for(int i=0; i<K; i++){
            max_sum += Arr.get(i);
        }
        sum = max_sum;
         while(last < N){
             sum = sum + Arr.get(last) - Arr.get(first);
             first++;
             last++;
             if(sum > max_sum){
             max_sum = sum;
              }
         }
         return max_sum;
    }
}