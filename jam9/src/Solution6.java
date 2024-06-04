// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution6 {

    public static void main(String[] args) {
        
       Scanner in= new Scanner(System.in);
      int x = in.nextInt();
      int[][] fac= new int[x][x];
      for(int i=0; i<x;i++)
         {            
            for(int j=0; j<x;j++)
            {
                fac[i][j]=in.nextInt();
            }
         }
      int ans=0;
         int hub = in.nextInt();
         int j=0;
         for (int i=hub;i<x;){
             
             for (; j<x;){
                 if (fac[i][j]!=0&&fac[i][j]!=-1){
                    ans+=fac[i][j];
                    break;
                 }else if (fac[i][j]==-1){
                     hub++;
                 }

             }
                              System.out.println(ans);
                              j++;

         }
         
         
           
        
        
      
               

    }
}