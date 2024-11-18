// swapping without using 3rd variable
package Practice15;
public class Swap2{
    public static void main(String[] args) {
        int x,y;
        x=50;y=100;
        System.out.println("Before Swapping x="+x+" and y="+y);

        x=x+y; //x=50+100=150
        y=x-y; //y=150-100=50
        x=x-y; //x=150-50=100

        System.out.println("After  Swapping x="+x+" and y="+y);
    }
}