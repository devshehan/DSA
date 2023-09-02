import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());

        stack.push("item01");
        stack.push("item02");
        stack.push("item03");
        stack.push("item04");
        stack.push("item05");

        //To remove the top-most element from the stack
        stack.pop();
        String popItem = stack.pop();
        System.out.println("pop element: "+popItem);

        //To know the top-most element from the stack
        System.out.println("top-most element: "+stack.peek());

        //Search method
        System.out.println("item02 location: "+stack.search("item02"));


        //System.out.println(stack);



    }
}