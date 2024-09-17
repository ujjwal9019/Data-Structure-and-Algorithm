package BasicMaths;
public class LC5{

    public int reverse(int x) {
        int reverse=0;
        while(x!=0){
            int n=x%10;
            if(reverse<Integer.MIN_VALUE/10 || reverse>Integer.MAX_VALUE/10){
                return 0;
            }
            reverse=reverse*10+n;
            x=x/10;
        }
        return reverse;
    }
}       