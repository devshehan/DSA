import java.util.LinkedList;

public class Main{
    /*
     *   What are the benefits over the Array/ArrayList?
     *       1.) insertion
     *       2.) deletion
     *               but access elements easy in Array/ArrayList because they have index.
     *
     *   Searching require O(n) complexity.
     *   Insert/Delete require O(1) complexity.
     *
     *   Singly LinkedList can goes only head to tail.
     *   Doubly LinkedList can go both side, but disadvantage is it requires memory more than singly linked list.
     *
     * */

    public static void main(String[] args) {

        LinkedList<String> booksList = new LinkedList<String>();

        // May use as the Stack
//        booksList.push("Atomic Habits");
//        booksList.push("The Way Man Superior");
//        booksList.push("Deep Work");

//        System.out.println(booksList);

        // May use as the Queue
//        booksList.offer("Atomic Habits");
//        booksList.offer("The Way Man Superior");
//        booksList.offer("Deep Work");

//        System.out.println(booksList);


        // linkedList
        booksList.addFirst("Atomic Habits");
        booksList.addFirst("The Way Man Superior");
        booksList.addFirst("Deep Work");
        booksList.addLast("Focus on your mind");

        System.out.println(booksList.indexOf("Atomic Habits"));
        System.out.println(booksList);

        // insertion and deletion
//        booksList.add("Healthy Sleep");
//        booksList.add(1,"Java Expert");
//        booksList.remove("Deep Work");
//        booksList.remove(0);

        System.out.println(booksList);
    }
}