import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("item01");
        queue.offer("item02");
        queue.offer("item03");
        queue.offer("item04");
        queue.offer("item05");

        //Checking whether queue is empty or not
        System.out.println("Is queue empty? "+queue.isEmpty());

        //Size of the queue
        System.out.println("Size of the queue: "+queue.size());

        //Search an item from queue
        System.out.println("Is item03 in the queue?: "+ queue.contains("item03"));

        System.out.println("Elements of the queue"+queue);

        //Peek method
        System.out.println("Top-most element of the Queue: "+ queue.peek());

        //Dequeue method
        System.out.println("Dequeue element: "+ queue.poll());
        System.out.println("Elements of the queue"+queue);
    }
}