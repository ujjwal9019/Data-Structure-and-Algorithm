package Recursion;

public class sumofSeries {
    long sumOfSeries(long n) {
        if(n== 0){
            return 0;
        }
        
        
        
        
     return (n*n*n) + sumOfSeries(n-1);
        
     
    }
    
}
