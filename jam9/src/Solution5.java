
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        int o = in.nextInt();
        int s = in.nextInt();
        int[] arr = new int[l];
        int ans = 0;

        for (int i = 0; i < l; ++i) {
            int x = in.nextInt();
            arr[i] = x;
            //ans += x;

        }
        int index =-1;
        int min= 999999999;
        for (int i = 0; i < s; ++i) {
            for (int j = 0; j < l; ++j) {
               if (arr[j] < min ){
 index = j ; 
min = arr[j];
}
            }
           // ans += (o - min);
arr[index] = o-min;
        }
        
                for (int i = 0; i < arr.length; ++i) {
                    ans+=arr[i];
                }
        System.out.println(ans);  

    }
}
