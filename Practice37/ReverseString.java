package Practice37;

import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        char[] letters = sc.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) 
        {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}