package String;

//Write a Java program to compare two Strings ignoring case using the equalsIgnoreCase() method.
public class Que11 {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "HELLO WORLD";
        String str3 = "Hello";

        System.out.println("str1 and str2 : " + str1.equalsIgnoreCase(str2));

        System.out.println("str1 and str3: " + str1.equalsIgnoreCase(str3));
    }
}
