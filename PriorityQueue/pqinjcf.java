package PriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class pqinjcf {
    public static void main(String args[]){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3); // O(logn) , n no of elements
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek()); // o(1)
            pq.remove(); // 0(logn)
        }
    }
}
