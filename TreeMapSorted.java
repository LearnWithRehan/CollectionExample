import java.util.TreeMap;

public class TreeMapSorted {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(3,"c");
        tm.put(1,"a");
        tm.put(2,"b");
        System.out.println(tm);
    }
}
