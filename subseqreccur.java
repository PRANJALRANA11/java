import java.util.*;
public enum subseqreccur{
    static ArrayList <String> subseq(String s){
        ArrayList <String> ans=new ArrayList <String> ();
           // base case
           if(s.length()==0){ 
               ans.add("");
               return ans;
           }   
           // relation
           char curr=s.charAt(0);
           ArrayList <String> smallans=subseq(s.substring(1));
           for(String ss:smallans){
               ans.add(ss);
               ans.add(curr+ss);
           }
           return ans;
       }
    
}
