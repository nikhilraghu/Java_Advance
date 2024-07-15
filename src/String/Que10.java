package String;
//nikhil
//Write a Java program to compare two Strings using the equals() method.
public class Que10 {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "Hello world";
        String str3 = "Hello";

        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal.");
        } else {
            System.out.println("str1 and str2 are not equal.");
        }

        if (str1.equals(str3)) {
            System.out.println("str1 and str3 are equal.");
        } else {
            System.out.println("str1 and str3 are not equal.");
        }
    }
}