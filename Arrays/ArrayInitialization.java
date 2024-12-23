package Arrays;
public class ArrayInitialization{
    public static void main(String[] args) {
        
        int[] myArray = {1, 2, 3, 4, 5};

        String[] myStringArray = new String[3];

        myStringArray[0] = "Java";
        myStringArray[1] = "Python";
        myStringArray[2] = "C++";

        System.out.println(myStringArray[1]);
        
        System.out.println(myArray[2]);
    }
}