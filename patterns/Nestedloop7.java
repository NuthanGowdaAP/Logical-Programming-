package com.java.patterns;

public class Nestedloop7 
{
    public static void main(String[] args)
    {
     int count=1;   
     int n=3;
     for(int i=1;i<=n;i++) 
     {
       for(int j=1;j<=n;j++)
       {
         System.out.print(count +" ");
         count++;
       } 
       System.out.println();
     }  
   }
}
