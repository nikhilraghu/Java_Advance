package String;

//Write a Java program to replace a specific character in a String with another character using the replace() method.
public class Que9 {
    public static void main(String[] args) {
        String h = "Hello world";
        char oldChar = 'o';
        char newChar = '*';
        String replacedString = h.replace(oldChar, newChar);
        System.out.println("Original: " + h );
        System.out.println("Replace: " + replacedString );
    }
}