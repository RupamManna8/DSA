package Codevita;

import java.util.Arrays;

public class CountPairs {
    public static int CountHappy(int arr[],int k){
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            int c = i - 1;
            while(c >= 0 && arr[c] >= arr[i] - k){
               count++;
               c--;
            }
            int d = i + 1;
            while(d < arr.length && arr[d] <= arr[i] + k){
               count++;
               d++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {10,2,5,23,20};
        System.out.println(CountHappy(arr, 3));
    }
}
