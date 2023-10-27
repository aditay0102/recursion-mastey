import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Day10 {
    private static void fucn(int index, int sum, ArrayList<Integer> list, ArrayList<Integer> sumSubSet , int N){
        if(index == 0){
            sumSubSet.add(sum);
            return;
        }

        // pick the element;
        fucn(index,sum + list.get(index),list,sumSubSet,N);
        // Dont pick the element
        fucn(index+1,sum,list,sumSubSet,N);

    }
    public static void main(String[] args){
        ArrayList<Integer> sumSubset = new ArrayList<>();
        fucn(0,0,arr,N,sumSubset);
        Collections.sort(sumSubset);
        System.out.print(sumSubset);
    }
}
