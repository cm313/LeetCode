class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        for(int i=0; i<n; i++){
          s = s.substring(1,n).concat(s.substring(0,1));
          if(s.equals(goal))
          return true;
        }
        return false;
    }
}