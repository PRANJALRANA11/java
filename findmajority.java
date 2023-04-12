public class findmajority {
    static void majority(int arr[]){
        int n=arr.length,count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                     count++;}
                    if(count>n){             
                        count=arr[i];
                        System.out.println(count);
            }	
            }
            }if(count==0)System.out.println("-1");
        
    }
    
}
