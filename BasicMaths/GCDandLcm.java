package BasicMaths;

public class GCDandLcm {
    class Solution {
        static Long[] lcmAndGcd(Long A , Long B) {
                Long o[]=new Long[2];
    Long M = (A*B);
        Long gcd = 1L; 
            // code here
              while(B != 0){
                 Long temp = B ;
                 B = A%B;
                 A = temp ; 
              }
              gcd = A;
    
    
    Long lcm = M/gcd ; 
    
    
    o[0] = lcm;
    o[1] = gcd;
    
    return o;
            
        }
    };
}
