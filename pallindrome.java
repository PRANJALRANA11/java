public class pallindrome {
    static String pallindrome(String s,int idx){
        if(idx==s.length())return "";
        String  smallans=pallindrome(s,idx+1);
        return smallans+s.charAt(idx); 
    
}
}