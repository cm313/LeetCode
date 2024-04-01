class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        String str = "";
        if(n == 0)
            return true;
        for(int i=0; i<n; i++){
            if(s.charAt(i)>=48 && s.charAt(i)<= 57)
               str += s.charAt(i);
            else if(s.charAt(i)>='A' && s.charAt(i)<= 'Z')
                str += String.valueOf(s.charAt(i)).toLowerCase();
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
                str += s.charAt(i);
            else
                continue;
        }
       String strPal= "";
        int len = str.length();
        for(int i = len-1;i>=0; i--){
           strPal+= str.charAt(i);
        }
        if(str.equals(strPal))
            return true;
        else
            return false;
    }
}