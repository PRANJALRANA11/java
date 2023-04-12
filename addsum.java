public class addsum {
    static void addsum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j =1;j<arr.length;j++){
                int add=arr[i]+arr[j];
                if(sum<add){
                    sum=add;
                }
            }
        }System.out.println(sum);
    }
    
}
