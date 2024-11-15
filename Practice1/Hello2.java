//Print your name by user input

import java.util.Scanner;
public class Hello2{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter Your First Name : ");
        String fname = inp.next();

        System.out.print("Enter Your Last Name : ");
        String sname = inp.next();

        System.out.println("Hello Mr."+fname+""+sname);
    }
}
