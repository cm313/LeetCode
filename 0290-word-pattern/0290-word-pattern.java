class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] arr = s.split(" ");
       Map<Character, String> map = new HashMap<>();
       if(pattern.length() != arr.length)
       return false;
       for(int i=0; i<arr.length; i++){
         char key = pattern.charAt(i);
        if(!map.containsKey(key) && !map.containsValue(arr[i])){
            map.put(key, arr[i]);
        }
      else if(!map.containsKey(key) && map.containsValue(arr[i]))
        return false;
        else if(map.containsKey(key) && !Objects.equals(map.get(key),arr[i]))
        return false;
       }
       return true;
    }
}