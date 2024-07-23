import java.util.Scanner;
import java.util.TreeSet;

public class Lab4_8706 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of strings: ");
        String input = scanner.nextLine();

        TreeSet<String> treeSet = new TreeSet<>();
        String[] words = input.split(" ");
        for (String word : words) {
            treeSet.add(word);
        }

        System.out.println(treeSet);

        scanner.close();
    }
}

//banana apple orange apple banana