import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = n ; i >= 0 ; i--){
            for(int j = i ; j > 0 ; j-- ){
                System.out.print("*"  + " ");
            }
            System.out.println();
        }
    }
}
