//Split the main array into two sub array

package Arrays;
import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        String[] names = {"Ravi", "Ritik", "Mukesh", "Shabbir", "Harsh","Akki","Tushar"};
        int splitIndex = 3;// Split after the third element
         // Create two sub-arrays
         String[] firstHalf = Arrays.copyOfRange(names, 0, splitIndex);
         String[] secondHalf = Arrays.copyOfRange(names, splitIndex, names.length);
         System.out.println("First Half: " + Arrays.toString(firstHalf));
         System.out.println("Second Half: " + Arrays.toString(secondHalf));
    }
}
