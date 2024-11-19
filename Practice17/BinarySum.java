/*
 Write a Java program to add two binary numbers.

In digital electronics and  mathematics, a binary number is a number expressed in the base-2 numeral system or binary numeral system. This system uses only two symbols: typically 1 (one) and 0 (zero).

Test Data:
Input first binary number: 100010
Input second binary number: 110010
 */

import java.util.Scanner;
public class BinarySum{
    public static void main(String args[]){
        System.out.println("Addition of Binary Numbers");
        Scanner inp=new Scanner(System.in);

        long b1,b2;
        int i=0,rem=0;
        int[] sum=new int[20];

        System.out.print("Input 1st Binary Number :");
        b1=inp.nextLong();

        System.out.print("Input 2nd Binary Number :");
        b2=inp.nextLong();

        while(b1!=0 || b2!=0){
            sum[i++]=(int)((b1%10+b2%10+rem)%2);
            rem=(int)((b1%10+b2%10+rem)/2);
            b1=b1/10;
            b2=b2/10;
        }
        if(rem !=0){
            sum[i++]=rem;
        }
        --i;

        System.out.print("Sum of Two Binary Numbers :");
        while(i>=0){
            System.out.print(sum[i--]);
        }
        System.out.println("\n");
    }
}