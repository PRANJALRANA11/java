public class Radixsort {
    static int findmax(int []arr){
        //    find the largest element
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }return max;
   }
    static void display(int []arr){
        for(int val:arr)System.out.println(val+"");
    }
    static void countsort(int[] arr,int place){
        int n=arr.length;
        int [] out=new int[n];
        int [] count=new int[10];
        for(int i=0;i<n;i++){
            count[(arr[i]/place)%10]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            out[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=out[i];
        }
    }
    static void radixsort(int []arr){
        int max=findmax(arr);
        for(int place=1;max/place>0;place+=10){
            countsort(arr, place);
        }
    }
    public static void main(String[] args) {
        int [] arr={2,4,21,123,3,23,432,4,43};

        radixsort(arr);
        display(arr);
    }
    
}
