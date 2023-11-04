import java.util.*;
import java.io.*;

public class day105 {
    private static  void sub(int index,int[] arr,List<List<Integer>>list,List<Integer>ds){
        if(index == arr.length){

            if(!list.contains(new ArrayList<>(ds))){
                list.add(new ArrayList<>(ds));
            }

            return;
        }
        Collections.sort(ds);
        sub(index+1,arr,list,ds);
        ds.add(arr[index]);
        sub(index+1,arr,list,ds);
        ds.remove(ds.size()-1);

    }
    public static void main(String[] args){
        int[] arr = {1,2,2};
        ArrayList<Integer> ds = new ArrayList<>();
        ArrayList<List<Integer>> list = new ArrayList<>();



        sub(0,arr,list,ds);
        System.out.print(list);

    }
}
