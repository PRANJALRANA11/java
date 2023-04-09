public class findmaxreccursion {
    static int  max(int[] arr, int idx){
    // base case
    if(idx==arr.length){
        return arr[idx];
    }
    // self work
    
    // recurence relation
    
    int smallinarray= max(arr,idx+1);			
    return Maths.max(arr[idx],smallinarray);
}	

    
}
