package String;

//Write a Java program to reverse a String.
public class Que7 {
    public static void main(String[] args) {
        String f = "Hello world";
        StringBuilder reversed = new StringBuilder(f);
        reversed.reverse();

        System.out.println("Original: " + f );
        System.out.println("Reversed: " + reversed.toString());
    }
}
