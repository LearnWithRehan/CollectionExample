import java.util.PriorityQueue;

public class PriorityQueuePoll {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(50);
        System.out.println("Originl pq "+ pq);
        System.out.println("Remove:- "+ pq.poll());
        System.out.println("After Poll" + pq);
    }
}
