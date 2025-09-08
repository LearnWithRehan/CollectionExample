import java.util.Hashtable;

public class HashtableAddSeaRem {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"Java");
        ht.put(2,"Kotlin");
        ht.put(3,"SQL");
        System.out.println("Original:- " + ht);
        System.out.println("Search:- "+ ht.containsKey(3));
        ht.remove(3);
        System.out.println("After Remove:- "+  ht);
    }
}
