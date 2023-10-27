// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Day3 {
    public static int sum (int n){
        if(n == 0){
            return 0;
        }

        return n + sum(n-1);
    }

    public static void main(String[] args) {
      // sum of first n naturl numbers
        int n  = 3;

        System.out.print(sum(n));


    }
}