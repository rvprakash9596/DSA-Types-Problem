public class MethodOverloading1 {
    static void ravi()
    {
        System.out.println("Hello guys ");
    }
    static void ravi(int a,int b)
    {
        int sum = a+b;
        System.out.println("The sum is :"+sum);
    }

    static void ravi(float x,float y,float z)
    {
        float sum = x+y+z;
        System.out.println("The sum is :"+sum);
    }

    public static void main(String[] args) {
        ravi();
        ravi(8,7);
        ravi(4,8,7);
    }
}
