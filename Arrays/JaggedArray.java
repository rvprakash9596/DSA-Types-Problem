package Arrays;

public class JaggedArray {
    public static void main(String[] args) {
      int[][] twoDArray = new int[2][];
      twoDArray[0] = new int[3];
      twoDArray[1] = new int[4];
      
      int counter = 0;
  
      // Initializing the jagged array
      for (int row = 0; row < twoDArray.length; row++) {
        for (int col = 0; col < twoDArray[row].length; col++) {
          twoDArray[row][col] = counter++;
        }
      }
  
      // Printing the jagged array
      for (int row = 0; row < twoDArray.length; row++) {
        System.out.println();
        for (int col = 0; col < twoDArray[row].length; col++) {
          System.out.print(twoDArray[row][col] + " ");
        }
      }
    }
  }
  