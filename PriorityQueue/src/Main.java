import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /*
        *   Priority Queue => It's a class like LinkedList
        * */

        Queue<Double> studentGpa = new PriorityQueue<>(Collections.reverseOrder());

        studentGpa.offer(4.1);
        studentGpa.offer(3.5);
        studentGpa.offer(3.0);
        studentGpa.offer(2.8);

        while(!studentGpa.isEmpty()){
            System.out.println(studentGpa.poll());
        }
    }
}