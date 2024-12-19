class Solution {
    public int maxProfit(int[] prices) {
       int i=0, j=1,buy=0,sell=0,dif=0, maxDif=0;
       int n = prices.length;
       while(j<n){
        dif = prices[j] - prices[i];
          if(dif < 0){
            i=j;
            j++;
        }
        else{
            maxDif = Math.max(dif,maxDif);
            j++;
        }
             
             
       }
       return maxDif;
    }
}