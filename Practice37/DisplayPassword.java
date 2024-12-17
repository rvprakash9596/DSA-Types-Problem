// Write a Java program to input and display your password.

import java.io.Console;

public class DisplayPassword {
    public static void main(String[] args) {
        Console cons;
        if ((cons = System.console()) != null) {
            char[] pass_ward = null;

            try {

                pass_ward = cons.readPassword("Input your Password:");
                System.out.println("Your password was: " + new String(pass_ward));
            } finally {
                if (pass_ward != null) {
                    java.util.Arrays.fill(pass_ward, ' ');
                }
            }
        } else {
            throw new RuntimeException("Can't get the password... No console");
        }
    }
}





/*

Input your Password:
Your password was: Samu@3432

*/