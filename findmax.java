public class findmax {
    static void maxofj_i(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]<=arr[j]&&i<j){
                    int max=j-i;
                    
                    if(max>ans){
                        ans=max;
                    }
                }
            }

        }System.out.println(ans);
    }
    
}
