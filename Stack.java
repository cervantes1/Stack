import java.util.EmptyStackException;

public class Stack<T> {

    private Node<T> top;

    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void push(T item) {
        Node<T> n = new Node<T>(item);
        n.next = top;
        top = n;
    }

    public T peek() {
        if (top == null)
            throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T pop() {
        if (top == null)
            throw new EmptyStackException();
        T curr = top.data;
        top = top.next;
        return curr;
    }

    public void display() {
        Node<T> curr = top;

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
