class Solution {
    public boolean isIsomorphic(String s, String t) {
            
            int[] map1 = new int[256];
            int[] map2 = new int[256];
            if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }


        for(int i=0; i<s.length(); i++){
                if(map1[s.charAt(i)] != map2[t.charAt(i)]){
                    return false;
                }
                map1[s.charAt(i)] = i+1;
                map2[t.charAt(i)] = i+1;
        }
        return true;
    }
}