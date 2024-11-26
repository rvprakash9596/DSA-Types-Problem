public class Method_Overloading {
//    static void change(int a)
//    {
//        a = 98;
//    }
//    static void change2(int [] arr)
//    {
//        arr[0]=98;
//    }
//    static void tellJoke() {
//        System.out.println("I invented new word!\n" + "Plagiarism ");
//    }


//  from here we are starting methods overloading
    static void foo()
    {
        System.out.println("Good morning bhai !");
    }
    static void foo(int a)
    {
        System.out.println("Good Morning "+a+" Bro!");
    }

    static void foo(int a,int b){
        int sum = a+b;
        System.out.println("Sum is : "+sum);
    }

    public static void main(String[] args)
    {
//        tellJoke();

//        int [] marks = {52,73,77,89,98,94};
// Case 1 : Changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is : "+x);

//        Case 2 : Changing the array
//        int [] marks = {52,73,77,89,98,94};
//        change2(marks);
//        System.out.println("The value of marks after changing the array is  : "+marks[0]);


        System.out.println("Method Overloading from Here ------ ");
        // In methods overloading we changes only parameter not void type 
        foo();
        foo(151);
        foo(20,25);
        //Arguments are  actual means 10 ,50 etc
        //Parameters are variables




    }
}
