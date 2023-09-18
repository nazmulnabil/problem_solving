import java.util.Queue;

class Solution {
    public void rotate(int[][] matrix) {
        Queue<Integer> queue = new LinkedList<>();
          int len=matrix.length;

        for(int j=0;j<len;i++){
           for(int i=len-1;i>=0;i--){
                  queue.add(matrix[i][j]);
           }
        }
        for(int i=0;i<len;i++){
           for(int j=0;j<len;j++){
            matrix[i][j]=queue.poll();
           }

        }

    }
}