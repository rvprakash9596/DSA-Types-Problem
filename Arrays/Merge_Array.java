package Arrays;

import java.util.Arrays;

public class Merge_Array {
    public static void main(String[] args) {
        String[] array1 = {"Aalu", "Matar", "Tamatar"};
        String[] array2 = {"Pyaj", "Dhaniya","Mirch"};
        String[] mergedArray = new String[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) 
        { 
            if (array1[i].compareTo(array2[j]) <= 0) 
            { 
                mergedArray[k++] = array1[i++];
            } 
            else 
            { 
                mergedArray[k++] = array2[j++];
            }
        }
        while (i < array1.length) 
        { 
            mergedArray[k++] = array1[i++];
        }
        while (j < array2.length) 
        { 
            mergedArray[k++] = array2[j++];
        }

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
