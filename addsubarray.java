public class addsubarray {
    static void addSubarray(int subarr[]){
        int target=9;
        for(int i=0;i<subarr.length;i++){
            for(int j =0;j<subarr.length;j++){
                if(subarr[i]+subarr[j]==target&&i<j)System.out.println(i+" ,"+j);
            }
            
        }
    }
    
}
