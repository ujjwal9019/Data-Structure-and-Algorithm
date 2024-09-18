package BasicMaths;
import java.util.*;
public class Armstrong {
    
    // import com.sun.java_cup.internal.runtime.Scanner;

	
	public static void main(String[] args) {
		// Write your code here
	  Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
		  int k = String.valueOf(n).length();

int checkarms = 0 ;
		int on = n ;
		while(n != 0){
			int digit =  n % 10 ; 
			n = n /10 ;

 Double power = Math.pow(digit, k);
			 checkarms += power; 
		}
		if(checkarms == on){
			System.out.println("true");
		}
		else{
			
			System.out.println("false");
		}

// System.out.println(checkarms);

	}
}


