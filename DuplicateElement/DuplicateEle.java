package DuplicateElement;

import java.util.HashSet;

public class DuplicateEle {
    public static void main(String[] args) {
        // String arr[]={"Java","C","C++","Python","Java","Python"};

//Approach1

        /*boolean flag=false;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Found Duplicate Element :"+arr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("Duplicate Element Not Found");
        }*/

//Approach 2 using HashSet in Data Structure
        String arr[]={"Java","C","C++","Python","Java","Python"};
        HashSet<String> langs=new HashSet<>();
        for(String l:arr)
        {
            if(!langs.add(l))
            {
                System.out.println("Found Duplicate Element :"+l);
            }
        }



        
    }
}