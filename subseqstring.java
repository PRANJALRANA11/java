public class subseqstring {
    static void  subseq_1(String s,String currans){
        if(s.length()==0){System.out.println(currans); return;}
        char curr=s.charAt(0);
        String st=s.substring(1);
        subseq_1(st,currans+curr);
        subseq_1(st,currans);
    }
    
}
