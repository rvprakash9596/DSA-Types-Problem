package Patterns;
import java.util.Scanner;
public class Damru {
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        n=sc.nextInt();
        for(i=0; i<=n-1; i++)
        {
            for(j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for(k=i; k<=n-1; k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }


        for(i=n-1; i>=0; i--)
        {
            for(j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for(k=i; k<=n-1; k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
        sc.close();

    }    
}



/*

Enter the number of Rows : 10

* * * * * * * * * * 
 * * * * * * * * * 
  * * * * * * * * 
   * * * * * * * 
    * * * * * * 
     * * * * * 
      * * * * 
       * * * 
        * * 
         *
         *
        * *
       * * * 
      * * * *
     * * * * *
    * * * * * *
   * * * * * * *
  * * * * * * * * 
 * * * * * * * * *
* * * * * * * * * *


*/