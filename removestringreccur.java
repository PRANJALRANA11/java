public class removestringreccur {
    static String removeString(String s,int idx){
        // base case
        if(idx==s.length())return "";
        // recurrsive work
        String smallans= removeString(s,idx+1);
        char currchar=s.charAt(idx);
        // self
        if(currchar!='a')	
            return currchar+smallans;
        else 
            return smallans;
    }
    
    
}
