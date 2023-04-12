public class findsumofalternateseriesreccur {
    static int sumOfno(int sum){
        // base case
        if(sum==0)
        return 1 ;
        // recurrsive relation
        if(sum%2==0){
            return sumOfno(sum-1)+sum; 
        }
        else{
            return sumOfno(sum-1)-sum;
        }
    }
    
}
