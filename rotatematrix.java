public class rotatematrix {
    static void rotate(int[][] matrix) {
        
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=0;j<matrix.length;j++){
                int[] temp=matrix[j];
                matrix[j]=matrix[i];
                matrix[i]=temp;
            }
        }for(int k=0;k<matrix.length;k++)
                for(int l=0;l<matrix.length;l++)
                    System.out.println(matrix[k][l]);
        
    }
        
}
