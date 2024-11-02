class Solution {
    public String reverseWords(String s) {
        s.trim();
        String revStr = "";
        String[] str = s.split(" ");

        int n = str.length;
        for(int i=n-1; i>=0; i--){
            if(str[i] != " "){
            revStr+=str[i];
            revStr+= " ";
            }
        }
        return revStr.replaceAll("\\s+", " ").trim();
    }
}