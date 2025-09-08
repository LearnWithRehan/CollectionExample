import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.add("Java");
        li.add("Python");
        li.add("C");
        li.addFirst("Kotlin");
        li.addLast("PHP");
        System.out.println(li);
    }
}
