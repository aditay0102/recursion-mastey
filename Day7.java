import java.util.*;
import java.io.*;


public class Day7 {
    // find Subsequence sum

    public static void Subsum(int index,ArrayList<Integer> list,int[] arr,int s , int sum,int n){
        // base case man
        if(index == n){
            if( s == sum){
                for(int i : list){
                    System.out.print(i + " ");

                }
                System.out.println();
            }

            return;
        }

        // for taking thje index
        list.add(arr[index]);
        s += arr[index];

        Subsum(index+1,list,arr,s,sum,n);

        list.remove(list.size()-1);
        s -= arr[index];

        Subsum(index+1,list,arr,s,sum,n);

    }

    public static void main(String[] args){
        int[] arr = {1,2,1};
        int s = 2;
        ArrayList<Integer> list = new ArrayList<>();
        Subsum(0,list,arr,0,s,arr.length);

    }
}
