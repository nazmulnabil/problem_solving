public class Solution extends GuessGame {
    public int guessNumber(int n) {
         int mid=0,left=1,right=n;;

         while(left<=right){
             mid=left+(right-left)/2;

             if(guess(mid)==0)
              return mid;
              else if(guess(mid)==-1)
                right=mid-1;
                else
                  left=mid+1;
         }
             return mid;

    }
}