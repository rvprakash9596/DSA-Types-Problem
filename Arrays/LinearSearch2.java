package Arrays;

import java.util.Scanner;
public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n=sc.nextInt();
        sc.nextLine();

        int[] ele=new int[n];
        System.out.println("Enter "+n+" element in the Array:");
        for(int i=0; i<n; i++)
        {
            ele[i]=sc.nextInt();
        }

        System.out.print("Enter the target element to search : ");
        int target = sc.nextInt();

        //Linear Search
        boolean found = false;

        for(int store :ele)
        {
            if(store==target)
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println(target+" is found");
        }
        else
        {
            System.out.println(target+" is not found");
        }
    }
}
