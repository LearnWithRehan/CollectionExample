import java.util.ArrayList;

public class UpdateList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("Kotlin");
        //update
        arrayList.set(0,"C");
        arrayList.set(1,"C++");
        System.out.println(arrayList);
    }
}
