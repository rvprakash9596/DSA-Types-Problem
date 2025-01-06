package Arrays;

import java.util.Arrays;

//Check Two Equal Array is true or not
public class TwoEqualArray{
    public static void main(String[] args) {
        String[] names1 = {"Arjun", "Bhavana", "Chitra"};
        String[] names2 = {"Arjun", "Bhavana", "Chitra"};
        String[] names3 = {"Bhavana", "Arjun", "Chitra"};
        boolean areEqual1 = Arrays.equals(names1, names2); // Should return true
        boolean areEqual2 = Arrays.equals(names1, names3); // Should return false
        System.out.println("Are names1 and names2 equal? " + areEqual1);
        System.out.println("Are names1 and names3 equal? " + areEqual2);
    }
}