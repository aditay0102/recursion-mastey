
import java.util.*;
import java.io.*;

public class Day4 {
    // Reverse the funcking array  Using recursion man

    public static void reverse(int i,int[] arr,int n){
        if(i>=n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverse(i+1,arr,n);
    }

    // check if a string is palindrom or not
    public static boolean palidroom(int i,String s){
        if(i>=s.length()){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return palidroom(i+1,s);
    }

    public static void main(String[] args){
        // Q1 reverce the array using recursion
        /*
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        reverse(0,arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        */

        // Q2 palindrom string using recursion
        String s = "ada";
        System.out.println(palidroom(0,s));

    }
}
