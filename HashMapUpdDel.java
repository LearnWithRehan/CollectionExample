import java.util.HashMap;
import java.util.Hashtable;

public class HashMapUpdDel {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Java");
        hm.put(2,"Python");
        hm.put(3,"PHP");
        System.out.println("Original:- "+hm);
        //update
        hm.put(2,"Update Python");
        System.out.println("After Update:- " + hm);
        //delete
        hm.remove(3);
        System.out.println("After Remove:-" +hm);
    }
}
