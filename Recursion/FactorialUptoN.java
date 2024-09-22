package Recursion;

import java.util.ArrayList;

public class FactorialUptoN {
    public static void main(String[] args) {
        ArrayList<Long> list2 = new ArrayList<>();
        list2 = factorialNumbers(10);
  System.out.println(list2);
    }



      public static void helper(long n, long num, long factorialValue, ArrayList<Long> list){
        if(factorialValue > n) return;
        list.add(factorialValue);
        helper(n, num+1, factorialValue * (num+1), list);
    }
   public  static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> list = new ArrayList<>();
        helper(n, 1, 1, list);
        return list;
    }
}
