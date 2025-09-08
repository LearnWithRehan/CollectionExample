import java.util.ArrayList;

public class sizeClearList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Java");
        arrayList.add("Kotlin");
        arrayList.add("Python");
        arrayList.add("SQL");
        System.out.println("Size:- " +arrayList.size());
        arrayList.clear();
        System.out.println("After Clear:- " +arrayList.size());
    }
}
