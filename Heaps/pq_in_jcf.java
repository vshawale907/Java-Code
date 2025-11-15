import java.util.Comparator;
import java.util.PriorityQueue;

public class pq_in_jcf {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3); // O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); // o(1)
            pq.remove(); // 0(logn)

        }
    }

}