//Integer to Binary
package Practice19;
import java.util.Scanner;

public class IntBin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int dec,quot,i=1,j;
        int bin_num[]=new int[100];

        System.out.print("Enter Decimal Number :");
        dec=inp.nextInt();

        quot=dec;
        while(quot!=0){
            bin_num[i++]=quot%2;
            quot=quot/2;
        }
        System.out.print("Binary Number is :");
        for(j=i-1; j>0; j--){
            System.out.print(bin_num[j]);
        }
    }
}
