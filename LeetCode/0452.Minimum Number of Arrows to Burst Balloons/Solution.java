import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        int c=1;
        if(points.length==1)
        return 1;  
       Arrays.sort(points, Comparator.comparingInt(a->a[1]));

       int end=points[0][1];
       
       for(int i=1;i<points.length;i++){
        if(points[i][0] > end ){
               c++;
               end=points[i][1];
           }
       }
        return c;
    }
}