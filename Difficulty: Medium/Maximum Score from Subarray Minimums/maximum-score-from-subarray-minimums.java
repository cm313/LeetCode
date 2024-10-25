//{ Driver Code Starts
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String token : tokens) {
                nums.add(Integer.parseInt(token));
            }

            Solution solution = new Solution();
            System.out.println(solution.pairWithMaxSum(nums));
        
System.out.println("~");
}

        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int n = arr.size();
        int i=0, j=1,sum=arr.get(0), maxSum=0, k=2;
        while(i<=j && j<n){
            int count=1;
           while(count<=k){
               if(count==k){
                   maxSum = Math.max(sum, maxSum);
                   sum-=arr.get(i);
                   i++;
                   break;
               }
               else{
               sum += arr.get(j);
               j++;
               count++;
               }
           }
        }
        return maxSum;
    }
}