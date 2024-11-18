package Practice15;

public class Swap1 {
    public static void main(String[] args) {
        
        int a,b,temp;
        a=20;
        b=30;
        System.out.println("Before Swapping a="+a+" and b="+b);

        // Now swapping start usig third variable that is very easy task..

        temp=a;
        a=b;
        b=temp;

        System.out.println("After Swapping a="+a+" and b="+b);
    }
    
}