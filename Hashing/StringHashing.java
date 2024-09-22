package Hashing;

public class StringHashing {
    
    public static void main(String[] args) {
        String s = "abcdabcfc";
        int [] hash = new int [26];
        for(int i = 0 ; i < s.length() ; i++ ){
            int asci = s.charAt(i);
            int num = asci - 97;
            hash[num] += 1;


        }
  
  System.out.println(hash[0]);
  System.out.println(hash[1]);
  System.out.println(hash[2]);
  System.out.println(hash[3]);
  System.out.println(hash[4]);
  System.out.println(hash[5]);
  System.out.println(hash[6]);
  System.out.println(hash[7]);
    }
}
