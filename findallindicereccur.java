public class findallindicereccur {
    static void findallindices(int arr[] , int target,int idx){
        if(idx==arr.length)return;
        if(arr[idx]==target)System.out.println(idx);
        findallindices(arr,target,idx+1);
    }
    
    
}
