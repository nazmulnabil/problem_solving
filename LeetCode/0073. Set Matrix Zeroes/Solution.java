import java.util.Queue;

class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<Integer> queue=new LinkedList<>();
        Queue<Integer> rowQueue=new LinkedList<>();

        for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0)
          {  queue.add(j);
            rowQueue.add(i);}
        
          }

        }

        while(!queue.isEmpty()){
             
            int num=queue.poll();
               int j=num;
            for(int i=0;i<matrix.length;i++){
                matrix[i][j]=0;
            }
        }

        while(!rowQueue.isEmpty()){
            int n=rowQueue.poll();
               int i=n;
            for(int j=0;j<matrix[0].length;j++){
                 if(i<matrix.length)
                matrix[n][j]=0;
            }

        }
    }
}