import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Double> queue1 = new PriorityQueue<>(Collections.reverseOrder());

        queue1.offer(3.0);
        queue1.offer(2.5);
        queue1.offer(4.0);
        queue1.offer(1.5);
        queue1.offer(2.0);

        System.out.println("Queue 01");
        while(!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }

        System.out.println("\n------------------\n");

        Queue<String> queue2 = new PriorityQueue<>();

        queue2.offer("B");
        queue2.offer("C");
        queue2.offer("A");
        queue2.offer("F");
        queue2.offer("D");

        System.out.println("Queue 02");
        while(!queue2.isEmpty()){
            System.out.println(queue2.poll());
        }
    }


}