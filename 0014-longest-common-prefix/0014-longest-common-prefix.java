class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len =  strs.length;
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[len-1];
        int index = 0;
        while(index < str1.length() && index < str2.length()){
            if(str1.charAt(index) == str2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return str1.substring(0, index);
    }
}