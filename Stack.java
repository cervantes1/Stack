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

    public void display() {
        Node<T> curr = top;

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
