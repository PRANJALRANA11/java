public class printarrayreccur {
    static void printarray(int[] arr, int idx){
        // base case
        if(idx==arr.length){
            return;
        }
        // self work
        System.out.println(arr[idx]);
        // recurence relation
        printarray(arr,idx+1);
    }
    
}
