class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c= n,i=0;
            for(i=0;i<flowerbed.length;i++){
                if(i==0 && flowerbed[i]==0&& flowerbed[i+1]==0){
                    c--;
                }
                else if (flowerbed[i-1]==0 && flowerbed[i]==0&& flowerbed[i+1]==0){
                    c--;
                }
                else if (i==nums.length-1&&flowerbed[i]==0&&flowerbed[i-1]==0){

                    c--;
                }


            }

            if(c>0)
            return false;
        return true;
    }
}