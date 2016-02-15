package com.asku.array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Logical {

   public static void main(String[] args) {
       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc=new Scanner(System.in);
     int T=sc.nextInt();
      for(int i=0; i<T; i++) 
      {
           int a=sc.nextInt();
           int b=sc.nextInt();
           int N=sc.nextInt();
          double result = a;
          for(double j=0; j<N; j++)
              {
              result = result + (Math.pow(2,j) * b);
              System.out.print((int)result);
              System.out.print(" ");
          }
          System.out.println("");
      }
   }
}