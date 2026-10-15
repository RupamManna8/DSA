package Recursion;

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
    public static void main(String[] args) {
        int arr[] = {10,3,5,6,8,9};
        // PrintArray(arr);
        // System.out.println(SumArray(arr));
        // System.out.println(FindMax(arr));
        PrintReverse(arr);
    }
}
