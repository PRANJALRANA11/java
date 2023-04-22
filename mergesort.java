public class mergesort {
    static void merge(int []arr,int idx,int mid,int r ){
        int n1=mid-idx+1;
        int n2=r-mid;
        int[]left=new int[n1];
        int []right=new int[n2];
        int i ,j ,k;
        for(i=0;i<n1;i++)left[i]=arr[idx+i];
        for(j=0;j<n2;j++)right[j]=arr[mid+1+j];
        i=0;
        j=0;
        k=0;
        while(i<n1 && j<n2){
            if(left[i]<right[j])arr[k++]=left[i++];
            else{arr[k++]=right[j++];}
        }
        while(i<n1)arr[k++]=left[i++];
        while(j<n2)arr[k++]=right[j++];
    }
    static void mergesort(int arr[],int idx,int r){
        if(idx>=r)return;
        int mid=(idx+r)/2;
        mergesort(arr,idx,mid);
        mergesort(arr,mid+1,r);
        merge(arr,idx,mid,r);
        
    }static void display(int []arr){
        for(int k:arr)System.out.println(arr[k]);
    }
    public static void main(String[] args){
         int [] arr={2,0,1,0,4};
        int idx=0;                                         
        int r=arr.length-1;
        mergesort(arr,idx,r);
        display(arr); 
    }
}


    

