package Patterns;

public class StarPattern15 {
    public static void main(String[] args) {
        int i,j,k;
        for(i=5; i>=1; i--)
        {
            for(j=5; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(k=1; k<(i*2); k++)
            {
                if(k>1 && k<(i*2)-1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for(i=2; i<=5; i++)
        {
            for(k=5; k>=i; k--)
            {
                System.out.print(" ");
            }
            for(j=1; j<(i*2); j++)
            {
                if(j>1 && j<(i*2)-1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}


/*

 *       *
  *     *
   *   *
    * *
     *
    * *
   *   *
  *     *
 *       *

*/