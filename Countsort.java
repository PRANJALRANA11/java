public class Countsort{
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
    static void countsort(int[] arr){
        int n=arr.length;
        int [] out=new int[n];
        int max=findmax(arr);
        int [] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            out[idx]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=out[i];
        }
    }
    public static void main(String[] args) {
        int [] arr={2,4,21,123,3,23,432,43};
        countsort(arr);
        display(arr);
    }
}
