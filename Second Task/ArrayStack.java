import java.util.ArrayList;

// Generic stack implemented with an ArrayList
public class ArrayStack<T> {
    private int maxsize;
    private ArrayList<T> items;

    public ArrayStack(int maxsize) {
        if (maxsize <= 0)
            throw new ArrayStackException("Stack size must be positive");
        this.items = new ArrayList<T>();
        this.maxsize = maxsize;
    }

    public void push(T item) {
        if (items.size() == maxsize)
            throw new ArrayStackException("Overflow Error");
        items.add(item);
    }

    public T pop() {
        if (isEmpty())
            throw new ArrayStackException("Underflow Error");
        return items.remove(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public static class ArrayStackException extends RuntimeException {
        public ArrayStackException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //stack.push(4); //overflow error
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // Generic: works with other types too
        ArrayStack<String> words = new ArrayStack<String>(2);
        words.push("Java");
        words.push("Collections");
        System.out.println(words.pop());
        System.out.println(words.pop());
    }
}