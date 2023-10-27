import java.util.*;
import java.io.*;

public class Day5 {

    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args){
        // day 5 multiple recursion calls
             int n = 6;

             System.out.print(fib(n));

    }
}
