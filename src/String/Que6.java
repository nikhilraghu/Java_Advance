package String;

//Write a Java program to split a String into an array of substrings using the split() method.
public class Que6 {
    public static void main(String[] args) {
        String e = "apple,banana,orange,grape";
        String[] fruits = e.split(",");

        System.out.println("Original: '" + e + "'");
        System.out.print("Splitted : [");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print("'" + fruits[i] + "'");
            if (i < fruits.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

