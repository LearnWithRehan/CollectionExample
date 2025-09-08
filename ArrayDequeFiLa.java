import java.util.ArrayDeque;

public class ArrayDequeFiLa {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(40);
        System.out.println("Original:- "+ ad);
        ad.addFirst(100);
        ad.addLast(1000);
        System.out.println("Final:-" + ad);
    }
}
