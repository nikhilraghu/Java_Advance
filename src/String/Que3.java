package String;

//Write a Java program to check if a String contains a specific substring using the contains() method.
public class Que3 {
    public static void main(String[] args) {
        String a = "Hello, how are you?";
        String b = "how";

        if (a.contains(b)) {
            System.out.println("found ");
        } else {
            System.out.println("not found ");
        }
    }
}
