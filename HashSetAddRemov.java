import java.util.HashSet;

public class HashSetAddRemov {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("Spring");
        hs.add("Kotlin");
        System.out.println("Before Removing:- "+ hs);
        hs.remove("Kotlin");
        System.out.println("After Removing:- "+hs);
    }
}
