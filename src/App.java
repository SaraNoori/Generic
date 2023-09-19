//import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] array = {2, 1, 3};
        Stack<Integer> s;

        //checking second constructor
        s = new Stack<Integer>(array);
        System.out.println(s);
        System.out.println();

        // check if push works
        s.push(5);
        System.out.println(s);
        System.out.println();

        // check if pop works
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println();

        //check if peek works
        System.out.println(s.peek());
        System.out.println();

        System.out.println(s.isEmpty());

        s = new Stack<Integer>();
        System.out.println(s.isEmpty());

    }
}
