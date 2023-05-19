import java.util.ArrayList;
import java.util.Collections;

public class Bucketsort{
    static void display(float []arr){
        for(float val:arr)System.out.println(val+"");
    }
    static void bucketsort(float arr[]){
        int n=arr.length;
        ArrayList<Float>[] buckets=new ArrayList[n];
        // create empty bucket
        for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
        }
        // add element to bucket
        for(int i=0;i<n;i++){
            int buckindex=(int)arr[i]*n;
            buckets[buckindex].add(arr[i]);
        }
        // sort each bucket
        for(int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }
        int index=0;
        for(int i=0;i<buckets.length;i++){
            ArrayList<Float> curr =buckets[i];
            for(int j=0;i<curr.size();j++){
                arr[index++]=curr.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float [] arr={2.8f,4.7f,21.5f};
        bucketsort(arr);
        display(arr);
    }
    }
