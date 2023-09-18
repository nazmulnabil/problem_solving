/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int mid=0,left=1,right=n,firstBadVersion=0;

            while(left<=right){
                mid=left+(right-left)/2;

                if(isBadVersion(mid)){
                      firstBadVersion=mid;
                      right=mid-1;
                }
                else if(isBadVersion(mid)==false){
                     left=mid+1;
                }
            }
               return firstBadVersion;
        }
    }