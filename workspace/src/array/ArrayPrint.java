import static java.lang.Math.*;
import static java.math.BigInteger.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import java.math.*;
import java.util.*;
import java.io.*;

public class ArrayPrint {
    public static void main(String[] args) { new ArrayPrint().Print(); }

    public void Print() {
        for(int i = 0; i < 10; i++) {
            System.out.print("\n[");
            for(int j = 0; j < 10; j++) {
                if(j == 0) {
                    System.out.print("{");
                }
                System.out.print("i"+i+"j"+j);
                if(j != 9){
                    System.out.print(", ");
                } else if(j == 9){
                    System.out.print(")");
                }
            }
            System.out.print("]\n");
        }
    }
}