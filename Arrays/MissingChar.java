package Arrays;

public class MissingChar {
    public static void main(String[] args) {
        String[] names = { "Arjun", "Bhavana", "Chitra", "Esha" };
        // Missing "Deepak"
        String expected = "Deepak";
        boolean found = false;
        for (String name : names) {
            if (name.equals(expected)) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(expected + " is missing in the array.");
        }
    }
}
