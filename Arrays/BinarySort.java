/*
Sort binary array in linear time.
Given a binary array, sort it in linear time and constant space. The output should print all zeros, followed by all ones.

For example,

Input:  { 1, 0, 1, 0, 1, 0, 0, 1 } 
Output: { 0, 0, 0, 0, 1, 1, 1, 1 }

*/
import java.util.Arrays;
public class BinarySort{
    public static void sort(int[] A) {
        // count number of 0's
        int zeros = 0;
        for (int value: A)
        {
            if (value == 0) {
                zeros++;
            }
        }
 
        // put 0's at the beginning
        int k = 0;
        while (zeros-- != 0) {
            A[k++] = 0;
        }
 
        // fill all remaining elements by 1
        while (k < A.length) {
            A[k++] = 1;
        }
    }
 
    public static void main (String[] args)
    {
        int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
 
        sort(A);
 
        // print the rearranged array
        System.out.println(Arrays.toString(A));
    }
}