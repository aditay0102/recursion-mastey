import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.*;
import java.io.*;

public class Day6 {
    public static void seq(int index,ArrayList<Integer> list, int[] arr , int n){
        if(index == n ){
            for(int i : list){
                System.out.print(i + " ");
            }

            System.out.println();
            return;
        }
        // take one condition
        list.add(arr[index]);

        seq(index+1,list,arr,n);
        list.remove(list.size()-1);

        seq(index+1,list,arr,n);
    }

    public static void sec(int index,ArrayList<Character>list,char[] arr,int n){
        if(index == n){
            for(char i : list){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        list.add(arr[index]);
        sec(index+1,list,arr,n);
        list.remove(list.size()-1);

        sec(index+1,list,arr,n);
    }



    public static void main(String[] args){
        // Day6 on Subseqquences

        /*
        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();

        seq(0,list,arr,arr.length);
        */


        String s  = "abc";
        char[] arr = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        int n = arr.length;

        sec(0,list,arr,n);



    }
}
