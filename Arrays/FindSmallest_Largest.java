package Arrays;

public class FindSmallest_Largest {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, -2, 7, 10};

        int smallest = findSmallest(numbers);
        int largest = findLargest(numbers);

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }

    public static int findSmallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
