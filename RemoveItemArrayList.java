import java.util.ArrayList;

public class RemoveItemArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("java");
        arrayList.add("kotlin");
        arrayList.add("Python");
        arrayList.add("C");
        arrayList.remove("kotlin");
        arrayList.remove("C");
        System.out.println(arrayList);
    }
}
