package Recursion;

// problem link 

// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-1-to-n-without-using-loops

public class BasicRecursion {

    public static void main(String[] args) {
        
    
    int N = 10;
    printNos(N);


}

public static void printNos(int N)
{
    if(N == 0)return;
    
    
     printNos(N-1);
     System.out.print(N + " ");
    
}

}
