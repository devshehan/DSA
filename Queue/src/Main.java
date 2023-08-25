import java.util.LinkedList;
import java.util.Queue;

public class Main{
    public static void main(String[] args) {

        /*
        *   QUEUE -> FIFO ( first in first out )
        *       It's like a highway entrance Queue
        *
        *   enqueue => add element into the queue
        *   dequeue => remove element from the queue
        *
        *   enqueue -> offer()
        *   dequeue -> poll()
        *   top     -> peek()
        *
        * */

        // in Java Queue is an interface
        Queue<String> carQueue = new LinkedList<String>();

        carQueue.offer("Lamborghini");
        carQueue.offer("Ferrari");
        carQueue.offer("Porsche");


        System.out.println(carQueue );
        carQueue.poll();
        carQueue.poll();

        System.out.println(carQueue);

        carQueue.poll();
        carQueue.poll();
        carQueue.poll();

        /*
        *   IMPORTANT -> poll()  ( handle try exception itself not like stack pop() )
        * */
        System.out.println(carQueue);

        /*
        *   So Queue is extending from the collection
        *   then we can use collection methods.
        * */

        carQueue.offer("Toyota");
        carQueue.offer("Rolls Royce");
        carQueue.offer("Land Cruiser");

        System.out.println(carQueue);

        System.out.println(carQueue.size());
        System.out.println(carQueue.isEmpty());
        System.out.println(carQueue.contains("Toyota"));

    }
}