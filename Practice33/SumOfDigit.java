import java.util.Scanner;
public class SumOfDigit{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Number:");
        long num =inp.nextLong();
        System.out.printf("Sum of %d = %d", num, sumDigits(num));
    }
    public static int sumDigits(long num){
        int sum=0;
        while(num != 0){
            sum+=num % 10;
            num=num/10;
        }
        return sum;
    }
}