class Quicksort{
    static int partition(int []arr,int st,int end){
        int pivot=arr[st];
        int cnt=0;
        int l=st+1;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<pivot)cnt++;
        }
            int pivotidx=st+cnt;
            while(l<=end){
            int temp=pivotidx;
            pivotidx=arr[l];
            arr[l]=temp;
            l++;
        }
            int j=st;
            int k=end;
            while(j<pivotidx && k>pivotidx){
                while(arr[j]>pivot||arr[k]<pivot){ 
                int  temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                j++;
                k--;
                }
            }return pivot;
        
        }
    
    static void quicksort(int[] arr,int st,int end){
        if(st>=end)return;
        int pi=partition( arr,st,end);
        end=pi-1;
        quicksort(arr,st,end);
        st=pi+1;
        quicksort(arr,st,end);
        for(int i=0;i<=arr.length-1;i++ ){
            System.out.println(arr);
        }
    } 
    public static void main(String[] args) {
        int [] arr={2,4,21,123,3,23,432,43,4};
        int st=0;
        int end=arr.length-1;
        quicksort(arr,st,end);
    }
}
