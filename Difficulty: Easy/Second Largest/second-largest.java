//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner ss = new Scanner(input);
            while (ss.hasNextInt()) {
                arr.add(ss.nextInt());
            }
            Solution ob = new Solution();
            int ans = ob.print2largest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        int n = arr.size();
        int max = Integer.MIN_VALUE;
        int sec_max = -1;
        for(int i=0; i<n; i++){
            if(arr.get(i) > max)
            max = arr.get(i);
        }
        for(int i=0; i<n; i++){
            if(arr.get(i) != max && arr.get(i) > sec_max){
                sec_max = arr.get(i);
            }
        }
        return sec_max;
    }
}