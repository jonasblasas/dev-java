import static java.lang.Math.*;
import static java.math.BigInteger.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import java.math.*;
import java.util.*;
import java.io.*;

public class Fibonacci {
    public static void main(String[] args) { new Fibonacci().run(); }
    Scanner in = new Scanner(System.in);
    void _err(Object...os) { System.err.println(deepToString(os)); }

    // 1-based
    public int rec_fib(int n) {
        if (n <= 2) {
            return 1;
        }

        return rec_fib(n-1) + rec_fib(n-2);
    }

    // 1-based input, 0-based logic
    public int it_fib(int n) {
        int[] numbers = new int[n];
        numbers[0] = 1;
        numbers[1] = 1;

        for(int i = 3; i <= n; i++) {
            numbers[i-1] = numbers[i-2]+numbers[i-3];
        }
        
        return numbers[n-1];
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Which fibonacci number would you like?");
        int n = in.nextInt();
        System.out.println("Recursive fibonacci method for n="+n+": "+rec_fib(n));
        System.out.println("Iterative fibonacci method for n="+n+": "+it_fib(n));
    }
}