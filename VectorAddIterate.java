import java.util.Vector;

public class VectorAddIterate {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(50);
        //for each loop
        for (int i : v){
            System.out.println(i);
        }

    }
}
