package String;

//Write a Java program to extract a substring from a String using the substring() method.
public class Que8 {
    public static void main(String[] args) {
        String g = "Hello world";

        String substring1 = g.substring(7);
        System.out.println("7 to end: " + substring1 );

        String substring2 = g.substring(0, 5);
        System.out.println("0 to 5: " + substring2 );
    }
}