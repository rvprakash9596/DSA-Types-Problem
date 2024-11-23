package Practice4;
public class Array1 {
    public static void main(String[] args) {

        //There are three main  ways to create an array in java.

        /*1. Declaration and memory allocation
         int [] marks = new int[5];*/



        /*2. Declaration and then memory allocation
         int marks;
         marks = new int[5];
        Initialization
        marks[0]=98;
        marks[1]=66;
        marks[2]=80;
        marks[3]=78;
        marks[4]=61;
        */



        /* 3. Declaration , Memory allocation and initialization together
         int [] marks = {80,74,66,61,71};
         sout(marks[2]);
         */



        //Example 1
        /*
        int [] marks = new int[5];
        marks[0]=98;
        marks[1]=66;
        marks[2]=80;
        marks[3]=78;
        marks[4]=61;
       // marks[5]=72;     ArrayIndexOutOfBoundsException
        {
            System.out.println(marks[1]);
        }
         */



        //Example 2
        /*
        int [] marks = new int[5];
        marks[0]=98;
        marks[1]=66;
        marks[2]=80;
        marks[3]=78;
        marks[4]=61;
        marks[4]=90;// the index 4 has now assigned with the value i.e. 90
        for(int array:marks)
        {
            System.out.println(array);
        }
         */



        //Example 3
        /*
        int[] marks1={34,56,82,77,84};
        for(int marks:marks1)
        {
            System.out.println(marks);
        }
        */



        //Example 4
        
        int [] marks ={42,45,20,5,83};
        for(int element : marks)
        {
            System.out.println(element);
        }
        


        //Example 5
       int x;
        for(x=0; x<=5; x++)
        {
            System.out.println("Sorry");
        }

    }
}