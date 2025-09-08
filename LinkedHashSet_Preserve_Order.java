import java.util.LinkedHashSet;

public class LinkedHashSet_Preserve_Order {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Java");
        lhs.add("Kotlin");
        lhs.add("SQL");
        System.out.println(lhs);
    }
}
