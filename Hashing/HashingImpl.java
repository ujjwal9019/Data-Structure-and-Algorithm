package Hashing;

public class HashingImpl {
    public static void main(String[] args) {
        
    
    
    int[] arr = {1,2,1,3,2,1,1,1};
    int[] hash = new int[13];

    for(int i =  0 ; i < arr.length ; i++){
        hash[arr[i]] += 1;
    }

    System.out.println(hash[1]);
    System.out.println(hash[2]);
    System.out.println(hash[3]);
    System.out.println(hash[4]);
}
    
}
