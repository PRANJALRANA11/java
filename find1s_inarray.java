public class find1s_inarray {
    static void nof_1(int[][] array,int row, int col){
        int count=1;
        int ans=0;
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                if(array[i][j]!=0){
                    if(count>j){
                        count=j;
                        ans =i;
    
                    }
                }
            }
        }
    }
 }
