import java.util.Scanner;

public class ArrayContainsElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element to search for: ");
        int x = sc.nextInt();
        
        boolean found = false;

        for (int element : array) {
            if (element == x) {
                found = true;
                break;
            }
        }
        
        // Output the result
        if (found) {
            System.out.println("The array contains the element " + x + ".");
        } else {
            System.out.println("The array does not contain the element " + x + ".");
        }
        
    }
}
