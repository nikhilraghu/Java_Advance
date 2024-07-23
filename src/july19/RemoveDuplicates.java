package july19;

//input    1 2 3 2 4 5 5 6     output is [1, 2, 3, 4, 5, 6]

import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split("\\s+");
        HashSet<Integer> uniqueIntegers = new HashSet<>();
        for (String s : inputArray) {
            uniqueIntegers.add(Integer.parseInt(s));
        }
        ArrayList<Integer> resultList = new ArrayList<>(uniqueIntegers);
        System.out.println(resultList);
    }
}
