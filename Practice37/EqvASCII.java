package Practice37;

import java.util.Scanner;

public class EqvASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char inp = sc.next().charAt(0);
        
        int asciiValue = inp;
        System.out.println("ASCII value of '" + inp + "' is: " + asciiValue);

    }
}
