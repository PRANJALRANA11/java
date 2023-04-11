    
    public class searchreccur{
    public static boolean search(int arr[],int idx, int target){
        // base case
        if(idx>=arr.length)return false;
        // self work
        if(arr[idx]==target)return true;
        // reccurence relation
        return search(arr,target,idx+1); 
    } 
    public static void main(String[] args) {
        int target=3;
        int  arr[]={1,2,6,3,3};
        int idx=0;
        if( search(arr,idx,target)){                        
            System.out.println("yes");}
        else
            System.out.println("no");
        }
    }

