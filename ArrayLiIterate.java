import java.util.ArrayList;

public class ArrayLiIterate {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Kotlin");
        arrayList.add("Python");
        for (String lang : arrayList){
            System.out.print(lang + " ");
        }
    }
}
