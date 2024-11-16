class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        
        pq.addAll(hm.entrySet());
        
        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        
        return result.toString();
    /*    int n = s.length();
        int p1=0,p2=0, count=0,max=0;
        String str="", resStr="";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        s = s.valueOf(ch, 0, n);
        while(p2<n){
            if(ch[p1] == ch[p2]){
                str += valueOf(ch[p2]);
                p2++;
                count++;
            }
            else{
                if(count>max){
                    max = count;
                    resStr = str+resStr;
                }
                else{
                    max = count;
                    str = str+sresStr;
                }
                p1=p2;
                count=0;
                str="";
            }
        }
        return str; */
    }
}