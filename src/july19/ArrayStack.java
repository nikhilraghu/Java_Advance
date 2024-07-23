package july19;

public class ArrayStack {
    private int[] array;
    private int top;

    public ArrayStack(int capacity) {
        array = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == array.length - 1) {
            throw new StackOverflowError("Stack is full");
        }
        array[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.isEmpty());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
