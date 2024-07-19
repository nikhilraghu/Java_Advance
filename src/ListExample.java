import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Stack;

public class ListExample {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.remove("2");
        arrayList.add(1, "Sourav");
        System.out.println("ArrayList: " + arrayList);


        List<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.remove("2");
        linkedList.add(1, "Sourav");
        System.out.println("LinkedList: " + linkedList);


        List<String> vector = new Vector<>();
        vector.add("1");
        vector.add("2");
        vector.remove("2");
      vector.add(1, "Sourav");
        System.out.println("Vector: " + vector);


        List<String> stack = new Stack<>();
        stack.add("1");
        stack.add("2");
        stack.remove("2");

        System.out.println("Stack: " + stack);
    }
}
