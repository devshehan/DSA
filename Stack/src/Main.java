import java.util.Stack;

public class Main{
    public static void main(String[] args) {

        // Stack => LIFO ( last in first out )
        //          push, pop
        //          to find the top of the stack uses .peak()

        Stack<String> gameStack = new Stack<String>();

        gameStack.push("FarCry");
        gameStack.push("Tomb Rider");
        gameStack.push("IGI");
        gameStack.push("Vice City");

        System.out.println("Top -> " + gameStack.peek());
        System.out.println(gameStack);

        String removeTop = gameStack.pop();
        System.out.println(gameStack);
    }
}