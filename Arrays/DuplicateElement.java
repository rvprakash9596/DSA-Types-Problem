package Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int arr[]={98,39,02,95,47,98,39};
        boolean flag=false;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate Element Found : "+arr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("Duplicate Elements Not Found");
        }
    }
}