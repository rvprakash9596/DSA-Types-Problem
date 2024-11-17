/*
 Write a Java program that takes five numbers as input to calculate and print the average of the numbers.

Test Data:
Input first number: 10
Input second number: 20
Input third number: 30
Input fourth number: 40
Enter fifth number: 50

The Average should be = 30
 */
import java.util.Scanner;
public class Average{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a=inp.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b=inp.nextInt();
        System.out.print("Enter 3rd Number : ");
        int c=inp.nextInt();
        System.out.print("Enter 4th Number : ");
        int d=inp.nextInt();
        System.out.print("Enter 5th Number : ");
        int e=inp.nextInt();
        int avg=(a+b+c+d+e)/5;
        System.out.print("The Average is : "+avg);
    }
}