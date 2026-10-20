package Recursion;

import java.util.ArrayList;

public class Practice {

    //print array elements 
    public static  void helper(int n[],int idx){
        if(idx >= n.length){
            return;
        }
        System.out.println(n[idx]);
        helper(n, idx + 1);

    }
    public static void PrintArray(int n[]){
        int idx = 0;
        helper(n,idx);
    }

    //Sum of array elements
    public static  int sumHelper(int n[],int left,int right){
        if(left == right){
            return n[left];
        }
        return n[left] + sumHelper(n, left +1, right);
    }
    public static int SumArray(int n[]){
        return sumHelper(n,0,n.length - 1);
    }

    //Largest in the array
    public static int MaxHelper(int n[],int idx){
        if(idx == n.length - 1){
            return  n[idx];
        }
        return Math.max(n[idx], MaxHelper(n, idx + 1));
    }
    public static int FindMax(int n[]){

        return MaxHelper(n, 0);
    }

    //Reverse an Array in place 
    public static void reverse(int arr[],int left,int right){
        if(left >= right){
            return; 
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left + 1, right - 1);
    }

    public static void PrintReverse(int arr[]){
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
        reverse(arr, 0, arr.length - 1);
        for(int i:arr){
            System.out.print(i + " ");
        }
    }

    //array subsequence
    public static void SequenceHelper(
        int arr[], int idx, ArrayList<Integer> current) {

        if (idx == arr.length) {
            System.out.println(current);
            return;
        }

        // Choice 1: Take the current element
        current.add(arr[idx]);
        System.out.println("operation");
        SequenceHelper(arr, idx + 1, current);

        // Backtrack: Undo the choice
        current.remove(current.size() - 1);
        System.out.println("remove state");
        System.out.println(idx);


        // Choice 2: Skip the current element
       SequenceHelper(arr, idx + 1, current);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        // PrintArray(arr);
        // System.out.println(SumArray(arr));
        // System.out.println(FindMax(arr));
        SequenceHelper(arr, 0, new ArrayList<>());
    }
}
