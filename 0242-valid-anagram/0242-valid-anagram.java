class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
       return  Arrays.equals(a1,a2);
       /* if(a1.length != a2.length){
            return false;
        }
        for(int i=0; i<a1.length; i++){
             if(a1[i]!=a2[i]){
                res = false;
                break;
             }
        }
        return res;*/
    }
}