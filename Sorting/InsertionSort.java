package Sorting;

public class InsertionSort {
   
   
    static void insert(int arr[],int i)
    {
     int swap = 0 ;
     for(int j = i ; j >= 1 ;j--){
         if(arr[j] < arr[j-1]){
             int temp = arr[j];
             arr[j]  = arr[j-1];
             arr[j-1] = temp;
             swap = 1;
         }
         if(swap == 0){
             break;
         }
     }
    }

   
   
    public static void main(String[] args) {
        int [] arr = {9,6,75,8,4,3,1,5};
         //code here
      for(int i = 0; i < arr.length; i++){
        insert(arr, i);
    }
    for(int k = 0 ;  k < arr.length ; k++){
        System.out.println(arr[k]);
    }
    }
}
