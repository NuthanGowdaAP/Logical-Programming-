/*
 
* * * * * 
*     * 
*   * 
* * 
* 
            */
package com.java.patterns;

public class Pattern11b
{
    public static void main(String[] args)
    {
        int n=5;
     for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n-i+1;j++)
        {
          if(j==1 ||j==n-i+1 || i==1)
            System.out.print("* ");
            else
            System.out.print("  ");
        }
        System.out.println();
        }
    }
}
