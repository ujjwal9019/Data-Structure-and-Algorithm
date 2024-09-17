package BasicMaths;

public class Palindrome {
    class Solution {
        public boolean isPalindrome(int x) {
            int org = x;
            int reverse = 0 ;
            while(x != 0 ){
               int n=x%10;
                if(reverse<Integer.MIN_VALUE/10 || reverse>Integer.MAX_VALUE/10){
                    return false;
                }
                reverse=reverse*10+n;
                x=x/10;
            }
    if(reverse == org && reverse >= 0){
        return true;
    
    }
    else{
        return false;
    }
        }
    }
}
