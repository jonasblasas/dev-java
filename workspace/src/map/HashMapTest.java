import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<String, Integer>();

        for(int i = 0; i < 10; i++) {
            if(myMap.get("empty") == null) {
                System.out.println("empty is null - inserting 1");
                myMap.put("empty", 1);
            } else {
                int cur = myMap.get("empty");
                myMap.put("empty", cur+1);
            }
        }

        System.out.println("empty is now " + myMap.get("empty"));

        for(int i = 0; i < 11; i++) {
            if(myMap.get("empty") == null) {
                System.out.println("empty is null - inserting 1");
                myMap.put("empty", 1);
            } else {
                int cur = myMap.get("empty");
                myMap.put("empty", cur-1);
            }
        }

        myMap.forEach((key,value) -> System.out.println(key + " = " + value));
    }
}