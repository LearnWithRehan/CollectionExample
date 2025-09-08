import java.util.HashSet;

public class HashSet_Search_Element {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("Kotlin");
        hs.add("Python");
        System.out.println("HashSet Search Contains "+hs.contains("Javaaaa"));
    }
}
