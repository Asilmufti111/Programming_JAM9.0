
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        double z = x / (y * 1.0);
        String zz = Double.toString(z);
        // int count = 0;
        String lrs = "";

        if (terminate(y)) {
            System.out.println(z);
            System.exit(0);
        }

        for (int i = 0; i < zz.length(); i++) {
            for (int j = i + 1; j < zz.length(); j++) {
                String s = lcp(zz.substring(i, zz.length()), zz.substring(j, zz.length()));

                if (s.length() > lrs.length()) {
                    lrs = s;
                }
            }
        }
        String sol = "" + lrs.charAt(0);

        // for (int i=1;i<lrs.length()-1;++i){
        if (lrs.charAt(0) != lrs.charAt(1)) {
            sol += lrs.charAt(1);

        }

        String soll = "";
        while (zz.charAt(0) != '.') {
            soll += zz.charAt(0);
            zz = zz.substring(1);
        }
        soll += ".";
        zz = zz.substring(1);

        for (int i = 1; i < zz.length();) {
            if (zz.substring(0, i).equals(sol) || zz.substring(0, i + 1).equals(sol)) {
                break;
            } else {
                soll += zz.charAt(0);
                zz = zz.substring(1);

            }
        }

        soll += "[" + sol + "]";
        System.out.println(soll);
    }

    public static String lcp(String s, String t) {
        int n = Math.min(s.length(), t.length());
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return s.substring(0, i);
            }
        }
        return s.substring(0, n);
    }

    public static boolean terminate(double y) {
        boolean flag = true;
        while (y % 2 == 0) {

            y /= 2;
        }

        for (int i = 3; i <= Math.sqrt(y); i += 2) {
            while (y % i == 0) {
                if (i != 5) {
                    if (i != 2) {
                        flag = false;
                    }
                }
                y /= i;
            }
        }

        if (y > 2) {
            if (y != 5) {
                if (y != 2) {
                    flag = false;
                }
            }
        }

        return flag;
    }
}
