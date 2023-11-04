import javax.sound.sampled.EnumControl;
import java.util.*;
import java.io.*;

public class Day11 { // Subset sum 2 leetcode
    private static void findSubsets(int index,int[] arr,List<Integer>ds, List<List<Integer>>list){
        list.add(new ArrayList<>(ds));
        for(int i=index;i<arr.length;i++){
            if(i != index && arr[i] == arr[i-1]) continue;
            ds.add(arr[i]);
            findSubsets(i+1,arr,ds,list);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,2};
        Arrays.sort(arr);
        List<List<Integer>>list = new ArrayList<>();
        findSubsets(0,arr,new ArrayList<>(),list);
        System.out.print(list);
    }
}
