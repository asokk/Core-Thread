package com.asku.array;
import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;
    
    /*If NN is odd, print "Weird".
    If NN is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
    If NN is even and, in between the range of 6 and 20(inclusive), print "Weird".
    If NN is even and N>20N>20, print "Not Weird"*/

    public class Solution {

        public static void main(String[] args) {

            System.out.println("Enter the nuber: ");
        	Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else{
               if(/*n%2==0 && */n>=2 && n<=5)
               {
            	   ans = "Not Weird";
               }
               else if(/*n%2==0 &&*/ n>=6 && n<=20)
               {
            	   ans = "Weird";
               }
               
               else/*(n>20)*/
               {
            	   ans = "Not Weird";
               }
               //Complete the code
                //ans= "Not Weird";
                
            }
            System.out.println(ans);
            
        }
    }
