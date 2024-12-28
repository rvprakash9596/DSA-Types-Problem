package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        String[] names={"Ravi","Prakash","Saurabh","Kumar","Dinkal"};
        String target = "Saurabh";
        boolean found = false;

        for(String name : names )
        {
            if(name.equals(target))
            {
                found = true;
                break;
            }
        }
        if(found)
        {
            System.out.println('"'+ target+ '"'+ "is found in array.");
        }
        else
        {
            System.out.println('"'+target+'"'+" is not found in array.");
        }
    }
}
