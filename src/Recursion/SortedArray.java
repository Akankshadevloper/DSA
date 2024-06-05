package Recursion;

public class SortedArray  {
    public static boolean isSorted(int arr[] , int idx){
        if(idx == arr.length-1){
            return true;
        }

      if(arr[idx]< arr[idx+1]){               // if(arr[idx]>= arr[idx+1]){
          // array is sorted till now        // array is unsorted
          return  isSorted(arr,idx+1);    // return false ;}
      }else{                                 // return isSorted(arr,idx+1);
          return false;
      }
    }
    public static void main(String[] args){
        int arr[] = {1,3,3 };
        System.out.println(isSorted(arr,0));

    }
}

//time complexity we are traversing the array one time so O(n)
