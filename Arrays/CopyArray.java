package Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] mainArr = {45,90,22,27,80,63,98}; 
        int[] copiedArr = new int[mainArr.length]; 
        System.arraycopy(mainArr, 0, copiedArr, 0, mainArr.length); 

        System.out.print("The copied element is : ");
        for(int i=0; i<copiedArr.length; i++)
        {
            System.out.print(+copiedArr[i]+" ");
        }
    }
}
