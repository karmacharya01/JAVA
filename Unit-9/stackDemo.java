
import java.util.Stack;
import javax.swing.text.Position;

public class stackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(34);
        stack.push(3);
        stack.push(4);
        System.out.println("Elements: " + stack);
        System.out.println("Elemwnt of Top: " + stack.peek());
        System.out.println("Position of Element 4: " + stack.search(4));
        System.out.println();
        while (stack.size() > 0) {
            System.out.println("Removed Element: " + stack.pop());
        }
        System.out.println("Is the stack empty: " + stack.empty());
    }
}
