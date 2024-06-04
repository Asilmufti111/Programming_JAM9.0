import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       int x = in.nextInt();
       double y = in.nextDouble();
       int z = in.nextInt();
       double interest =x;
       
       if (x > 100000000 || x < 100||y > 3 || y < 1||z > 50000){
           System.out.println("Error");
       System.exit(0);
       }
       y=y/100.0;
       
       for(int i = 1; i<12; i++){
            interest = interest*(1+(y));
           interest -= z;
       }
       String v = x >= interest? "Bad" : "Good";
       
       System.out.print((int)interest + "\n" + v);
    }
}