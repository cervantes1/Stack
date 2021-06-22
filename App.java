public class App {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(7);
        s.push(2);
        s.push(90);

        System.out.println(s.pop());
        System.out.println("---");
        s.display();
    }
}