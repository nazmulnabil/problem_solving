class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
         
        for(int i=0;i<=n;i++){
           String bString = Integer.toBinaryString(i);
           int c=0;
           for(int j=0;j<bString.length();j++){
                if(bString.charAt(j)=='1')
                c++;
           }  
           ans[i]=c;  

        }
        return ans;
    }
}