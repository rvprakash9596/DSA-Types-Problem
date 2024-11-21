// Write a Java program to check whether Java is  installed on your  computer.

package Practice31;

public class Check_Java {
    public static void main(String[] args) {
        System.out.println("Java Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("System Home: "+"java.home");
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path"));
    }
}
