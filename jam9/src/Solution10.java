
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        String[] names = new String[x];
        for (int i = 0; i < x; i++) {
            String s = in.nextLine();
            for (int j = s.length() - 1; j > 0; j--) {
                if (s.charAt(j) == ' ') {
                    names[i] = s.substring(j + 1);
                    break;
                }
            }
            //  System.out.println(names[i]);

        }
        int[] counter = new int[x];
        for (int i = 0; i < counter.length; i++) {
            counter[i] = 1;
        }
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equalsIgnoreCase(names[j])) {
                    counter[i]++;
                    // System.out.println(counter[i]);

                }
            }
            //System.out.println(counter[i]+" "+ names[i]);
        }
        int max = 0, min = 999999;
        int maxindex = 0, minindex = 0;
        for (int i = 0; i < counter.length - 1; i++) {
            if (counter[i] > max) {
                max = counter[i];
            }
            if (counter[i] < min) {
                min = counter[i];
            }
        }
        double enmin = 0.0, enmax = 0.0;
        for (int i = 0; i < counter.length - 1; i++) {

            if (counter[i] == max) {
                enmax++;

            }

            if (counter[i] == min) {
                enmin++;

            }

        }
        System.out.println((int) ((enmax / x) * 100.0));

        System.out.println((int) ((enmin / x) * 100.0));

    }

}
