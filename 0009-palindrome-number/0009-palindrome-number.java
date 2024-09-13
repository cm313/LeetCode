class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev=0,temp=x;
        while(x!=0){
               int digit=x%10;
               rev=rev*10+digit;
               x/=10;
        }
        if(temp==rev)
        return true;
        return false;
    }
}