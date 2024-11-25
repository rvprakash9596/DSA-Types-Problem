import java.util.*;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*int age = 18;
        boolean b = (age==18);
        if(age > 18)

//        if(b >= 18)

        {
            System.out.println("You can drive yur car , Ramu kaka .");
        }
        else
        {
            System.out.println("Sorry ! Ramu kaka, You cant't drive your car . ");
        } */



            /*System.out.println("Please entr your age here : ");
            int age = sc.nextInt();
            if(age>18)
            {
            System.out.println(" Yes Ramu kaka , you can drive car ");
            }
            else
            {
                System.out.println("No Ramu kaha , You can not drive the car ");
            } */

        System.out.println("Beta enter your marks here :");
        int marks = sc.nextInt();
        if(marks >= 90)
        {
            System.out.println("Papa - Shabahs Beta !!");
        }
        else if (marks >80 && marks<90)
        {
            System.out.println("Papa - Kuch Sheekh gdhe ! Sharma ji k bete ka 95 marks aaya hai ");
        }
        else
        {
            System.out.println("Papa - Nalayak.... Gadhe.....Kya kmi rh gai thi mere sanskar me..");
        }

    }
}
