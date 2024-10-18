class Solution {
    public String largestOddNumber(String num) {
      /*  int n = num.length();

        long val = Long.parseLong(num);
        while(val != 0){
           if(val%2 !=0){
            return Long.toString(val);
           }
           val/=10;
        }
        return "";*/
         for(int i=num.length();i>=0;i--){
            if(i!=0 && num.charAt(i-1)%2!=0) {
                return num.substring(0,i);
            }
            if(i==0){
                if(i%2!=0)
                return num.substring(0,1);
        }
        }
        return "";
        
    }
}