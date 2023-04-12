public class reversestringreccur {
    static String reverseString(String s,int idx){
        if(idx==s.length())return "";
        String  smallans=reverseString(s,idx+1);
        return smallans+s.charAt(idx); 
    }
    
}
