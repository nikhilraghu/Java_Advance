package String;
//Write a Java program to trim the whitespace from a String using the trim() method.
public class Que5 {
    public static void main(String[] args) {
        String d = "   Hello world   ";
        String trimmedString = d.trim();

        System.out.println("Original: " + d );
        System.out.println("Trimmed : " + trimmedString );
    }
}
