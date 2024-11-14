class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1 != n2)
        return false;
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i<n1; i++){
            if(!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i)))
                return false;
                map.put(s.charAt(i),t.charAt(i));
            }
            else{
              if(map.get(s.charAt(i)) == t.charAt(i)){
                continue;
              }
              else{
                return false;
              }
            }
        }
         return true;
    }
}