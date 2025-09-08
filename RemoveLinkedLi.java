import java.util.LinkedList;

public class RemoveLinkedLi {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.add("Java");
        li.add("Python");
        li.add("PHP");
        li.add("SQl");
        //remove
        li.removeFirst();
        li.removeLast();
        System.out.println(li);
    }
}
