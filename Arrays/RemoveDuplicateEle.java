package Arrays;
import java.util.*;

public class RemoveDuplicateEle{
    public static void remove(int [] a) {
        LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
        for(int i=0; i<a.length; i++)
        s.add(a[i]);
        System.out.print(s);

    }
    public static void main(String[] args) {
        int a[]={98,39,02,95,98,39,47,39,98};
        System.out.print("Before removing duplicate element : ");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        System.out.print("After removing duplicate element : ");
        remove(a);
    }
}