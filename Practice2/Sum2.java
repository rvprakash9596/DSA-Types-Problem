//2.Addtion of two numbers using user input
import java.util.Scanner;
public class Sum2{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter 1st Number :");
        int fn = inp.nextInt();

        System.out.print("Enter 2nd Number : ");
        int sn  = inp.nextInt();

        int sum = fn+sn;

        System.out.println("The sum of "+fn+"+"+sn+" ="+sum);
    }
}
