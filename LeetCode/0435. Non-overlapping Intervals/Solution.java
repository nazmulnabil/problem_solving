class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==1)
            return 0;
       Arrays.sort(intervals, Comparator.comparingInt(a->a[1]));
        
        int c=1;
        int end=intervals[0][1];
        
        for(int i=0;i<intervals.length;i++){
           if(intervals[i][0]>=end){
               c++;
               end=intervals[i][1];
           }            
        }
        return intervals.length-c;
        
    }
}