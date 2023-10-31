import java.util.*;
import java.io.*;
public class Day9 {
    public static void findCombinations(int index,int target,int[] arr, List<List<Integer>> list,List<Integer> ds ){
        if(target == 0){
            list.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i > index && arr[i] == arr[i-1]) continue;
            if(arr[index] > target) break;

            ds.add(arr[index]);
            findCombinations(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);

        }
    }

    public static void main(String[] args){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}
