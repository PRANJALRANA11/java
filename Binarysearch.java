public class Binarysearch{
    static void display(int []arr){
        for(int val:arr)System.out.println(val+"");
    }
    static boolean searching(int []arr,int target){
        int n=arr.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid =(l+r)/2;
            if(arr[mid]==target)return true;                  
            else if(arr[mid]>target)r=mid-1;
            else l=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int target=2;
       System.out.println(searching(arr,target));  
        //display(arr);
    }
}
