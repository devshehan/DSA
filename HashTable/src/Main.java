import java.util.Hashtable;

public class Main{
    public static void main(String[] args) {

        // most suitable for large data set
        // best case O(n), worst case O(n)
        // different type of data types use different type of hashcode formula.

        Hashtable<Integer,String> hashtable = new Hashtable<>(100);

        hashtable.put(12,"Optimus Prime");
        hashtable.put(10,"Bee");
        hashtable.put(1,"Ratchet");
        hashtable.put(2,"Sam");

        hashtable.remove(1);

        for(Integer k : hashtable.keySet()){
            System.out.println(k.hashCode()+ "\t" + k + "\t" + hashtable.get(k));
        }

    }
}