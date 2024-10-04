package Sorting;



public class SelectionSort {

public static int select(int[] arr , int i){
    

 int  minindex = i ; 
    
    //loop to find minimmum
    for(int j = i ; j < arr.length ; j++ ){
        if(arr[j] < arr[minindex]){
            minindex = j ;
        }
        
        
    }
    return minindex;
	    

}


public static void main(String[] args) {
    

    int [] arr = {4,3,1,9,2,6};

    for(int i = 0 ; i < arr.length; i++){
	    int minindex =  select(arr,i);
	    // Swap the found minimum element with the current element
            if (minindex != i) {
                int temp = arr[minindex];
                arr[minindex] = arr[i];
                arr[i] = temp;
            }
	    }

        // printing the loop

        for(int k = 0 ; k < arr.length ; k++){
            System.out.print(arr[k] + " "  );
        }
    }
}
