package DuplicateElement;

public class DuplicateEle {
    public static void main(String[] args) {
        String arr[]={"Java","C","C++","Python","Java"};
        //Approach1
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Found Duplicate Element :"+arr[i]);
                }
            }
        }
        
    }
}
